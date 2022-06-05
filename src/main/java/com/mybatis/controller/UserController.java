package com.mybatis.controller;

import com.mybatis.entity.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        List<User> list = userService.findAll();

        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/user/index";
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
    public ModelAndView  findById(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("update");
        modelAndView.addObject("user",userService.findById(id));
        return modelAndView;
    }


}
