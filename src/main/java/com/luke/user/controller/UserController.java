package com.luke.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/")
    public String home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return "index";
    }
}
