package com.inspire.sys;


import com.inspire.hy.User;
import com.inspire.persistence.PageUtils;
import com.inspire.vo.hy.TRegister;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/")
@Slf4j
public class OfficeAction {

    @RequestMapping(value = "login.html",method = RequestMethod.GET)
    public String login(Model model){
        if (SecurityUtils.getSubject().isAuthenticated())
            return "redirect:/index.html";
        else
            return "page/login";
    }

    @RequestMapping(value = "index.html",method = RequestMethod.GET)
    public String index(Model model){
        return "page/index";
    }

    @RequestMapping(value = "index.shtml",method = RequestMethod.GET)
    public String pageIndex(Model model){
        return "page/page";
    }

    @RequestMapping(value = "logout.shtml",method = RequestMethod.GET)
    public String logout(){
        return "page/login";
    }

    @RequestMapping(value = "register.html",method = RequestMethod.GET)
    public String register(Model model, HttpServletRequest request){
        model.addAttribute("data",new TRegister());
        return "page/register";
    }

    @PostMapping(value="login.html")
    public String login(@Valid User user, RedirectAttributes redirectAttributes, BindingResult bindingResult, HttpServletRequest request, HttpSession session){
        if (bindingResult.hasErrors()) {
            return "page/login";
        }
        String loginName = user.getSusername();
        log.info("准备登陆用户 => {}", loginName);
        UsernamePasswordToken token = new UsernamePasswordToken(loginName,user.getSpassword());
        //获取当前的Subject
        Subject currentUser = SecurityUtils.getSubject();
        try {
            //在调用了login方法后,SecurityManager会收到AuthenticationToken,并将其发送给已配置的Realm执行必须的认证检查
            //每个Realm都能在必要时对提交的AuthenticationTokens作出反应
            //所以这一步在调用login(token)方法时,它会走到MyRealm.doGetAuthenticationInfo()方法中,具体验证方式详见此方法
            log.info("对用户[" + loginName + "]进行登录验证..验证开始");
            currentUser.login(token);
            log.info("对用户[" + loginName + "]进行登录验证..验证通过");

//            String checkCode = session.getAttribute(RandomValidateCodeUtil.KAPTCHA_SESSION_KEY).toString().trim();
//            if (!checkCode.equalsIgnoreCase(request.getParameter("checkcode").trim())) {
//                log.info("验证码不正确："+request.getParameter("checkcode").trim());
//                token.clear();
//                return "redirect:/login.html";
//            }
        } catch (UnknownAccountException uae) {
            log.info("对用户[" + loginName + "]进行登录验证..验证未通过,未知账户");
            redirectAttributes.addFlashAttribute("message", "未知账户");
        } catch (IncorrectCredentialsException ice) {
            log.info("对用户[" + loginName + "]进行登录验证..验证未通过,错误的凭证");
            redirectAttributes.addFlashAttribute("message", "密码不正确");
        } catch (LockedAccountException lae) {
            log.info("对用户[" + loginName + "]进行登录验证..验证未通过,账户已锁定");
            redirectAttributes.addFlashAttribute("message", "账户已锁定");
        } catch (ExcessiveAttemptsException eae) {
            log.info("对用户[" + loginName + "]进行登录验证..验证未通过,错误次数过多");
            redirectAttributes.addFlashAttribute("message", "用户名或密码错误次数过多");
        } catch (AuthenticationException ae) {
            //通过处理Shiro的运行时AuthenticationException就可以控制用户登录失败或密码错误时的情景
            log.info("对用户[" + loginName + "]进行登录验证..验证未通过,堆栈轨迹如下");
            ae.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "用户名或密码不正确");
        }
        //验证是否登录成功
        if (currentUser.isAuthenticated()) {
            log.info("用户[" + loginName + "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)");
            return "redirect:/index.shtml";
        } else {
            token.clear();
            return "redirect:/login.html";
        }
    }
}
