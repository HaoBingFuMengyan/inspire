package com.inspire.hy;

import com.inspire.exception.ServiceException;
import com.inspire.vo.hy.TRegister;
import com.inspire.web.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/hy/user")
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "register.html", method = RequestMethod.POST)
    public String register(TRegister t, Model model, HttpServletRequest request, HttpSession session, RedirectAttributes redirectAttributes) {
        try {

            return "page/register-ok";
        }catch (ServiceException ex){
            ex.printStackTrace();
            Msg.error(model,ex.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            Msg.error(model,"系统错误，请联系管理员");
        }
        redirectAttributes.addAttribute("data",t);
        return "redirect:/register.html";
    }


}
