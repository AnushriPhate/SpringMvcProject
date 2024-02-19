package com.spring.mvc.SpringMvcProject.controllers;

import com.spring.mvc.SpringMvcProject.models.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
//    @PostMapping("/create")
//    public String createStudent(@RequestBody Map<String, Object> data){
//        System.out.println(data);
//
//        Object name = data.get("name");
//        Object empId = data.get("empId");
//        System.out.println("Name : " + name);
//        System.out.println("EmpId : " + empId);
//
//        return "created";
//    }

//    @PostMapping("/create")
//    public String createStudent(@RequestBody Student student){
//        System.out.println(student);
//        return "created";
//    }

    @PostMapping("/create")
    public String createStudent(@RequestBody List<Student> students){
        System.out.println("Student list size " + students.size());
        System.out.println(students);
        return "created";
    }
}
