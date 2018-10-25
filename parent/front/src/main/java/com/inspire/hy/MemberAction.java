package com.inspire.hy;

import com.inspire.lg.LoginUser;
import com.inspire.securityShiro.ShiroUtils;
import com.inspire.web.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletRequest;

@Controller
@RequestMapping(value = "/hy/member")
public class MemberAction {

    @Autowired
    private MemberService memberService;

    /**
     * 会员认证申请
     * @param apply
     * @param type
     * @param model
     * @param request
     * @return
     */
    @RequestMapping(value = "authapply.shtml",method = RequestMethod.GET)
    public String authApply(Authapply apply, @RequestParam(defaultValue = "0") int type, Model model, ServletRequest request) {
        LoginUser user = ShiroUtils.getCurrentUser();
        try {
//            Authapply authapply = authapplyService.findLastApply(user.getMemberId());
//            if(authapply!=null && type!=500){
//                apply=authapply;
//            }
        } catch (Exception e) {
            Msg.error(model, "系统异常，请联系管理员");
            e.printStackTrace();
        }
//        model.addAttribute("data", apply);
//        model.addAttribute("user",user);
//        String  sbusinessno=null;
//        if(apply.getSbusinessno()==null){
//            sbusinessno="";
//        }else {
//            sbusinessno = apply.getSbusinessno().substring(apply.getSbusinessno().lastIndexOf("/") + 1);
//        }
//        model.addAttribute("businessno",sbusinessno);
//        if (AuthenticateType.No.isEq(user.getAuthtype()))
//            return "member/authapply";
//        else
//            return "member/authapplyed";
        return "member/authapply";
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "index.shtml",method = RequestMethod.GET)
    public String index(){
        return "member/authapply";
    }
}
