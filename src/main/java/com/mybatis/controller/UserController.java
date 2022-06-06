package com.mybatis.controller;

import com.mybatis.entity.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public ModelAndView findAll(ModelAndView modelAndView) {
        List<User> list = userService.findAll();
        modelAndView.setViewName("index");
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/user/index";
    }

    @GetMapping("/saveView")
    public String saveView() {
        return "save";
    }

    @PostMapping("/save")
    public String save(User user) {
        userService.saveOrUpdate(user);
        return "redirect:/user/index";
    }

    @PostMapping("/update")
    public String update(User user) {
        userService.saveOrUpdate(user);
        return "redirect:/user/index";
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("user",userService.findById(id));
        return modelAndView;
    }


}
