package com.inspire.sys;


import com.inspire.persistence.PageUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class OfficeAction {

    @RequestMapping(value = "login.html",method = RequestMethod.GET)
    public String login(Model model){
        if (SecurityUtils.getSubject().isAuthenticated())
            return "redirect:/index.html";
        else
            return "hy/login";
    }

    @RequestMapping(value = "index.html",method = RequestMethod.GET)
    public String index(Model model){
        return "page/index";
    }

    @RequestMapping(value = "logout.shtml",method = RequestMethod.GET)
    public String logout(){
        return "hy/login";
    }
}
