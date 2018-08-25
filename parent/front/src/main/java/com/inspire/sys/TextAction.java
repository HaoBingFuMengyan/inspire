package com.inspire.sys;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class TextAction {

    @RequestMapping(value = "list.shtml")
    public String index(Model model){
        model.addAttribute("model","helloword");
        return "sys/index";
    }
}
