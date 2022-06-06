package com.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/index")
    public String hello(Model model){
        System.out.println("hello world...");
        model.addAttribute("msg","hello world thymeleaf");
        return "index";
    }
}
