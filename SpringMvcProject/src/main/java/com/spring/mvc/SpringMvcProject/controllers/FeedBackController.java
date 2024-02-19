package com.spring.mvc.SpringMvcProject.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeedBackController {

    @GetMapping("/feedbacks")
    public List<String> getFeedbacks()
    {
        List<String> feedbacks = Arrays.asList("Good Student", "Brilliant minds", "disiplined person");
        return feedbacks;
    }

    @PostMapping("create-feedback")
    public String createFeedbacks()
    {
        System.out.println("Feedback created");
        return "Created feedback";
    }
}
