package com.inspire.sys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by haobingfu on 2018/8/12.
 */
@Controller
@RequestMapping(value = "/sys")
public class AdminController {

    @RequestMapping(value = "index.shtml")
    public String index(Model model){
        model.addAttribute("msg","您好，springboot");
        return "sys/index";
    }
}
