package com.spring.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SuperMan {

    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Processing about request");
        return "about";
    }

    @RequestMapping("/services")
    public String serviceRequestHandler(){
        System.out.println("Processing service request");
        return "services";
    }
}
