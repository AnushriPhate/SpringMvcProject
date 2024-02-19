package com.spring.mvc.SpringMvcProject.controllers;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/login")
    public String showLoginPageHandler(){
        return "login";
    }
}