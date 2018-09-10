package com.inspire.sys;


import com.inspire.persistence.PageUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class OfficeAction {

    @RequestMapping(value = "list.shtml")
    public String index(Model model){
        model.addAttribute("model","helloword");
        return "sys/index";
    }
}
