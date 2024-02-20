package com.spring.mvc.SpringMvcProject.controllers;

import com.spring.mvc.SpringMvcProject.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

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

//    @PostMapping("/create")
//    public String createStudent(@RequestBody List<Student> students) {
//        System.out.println("Student list size " + students.size());
//        System.out.println(students);
//        return "created";
//    }

//    @PostMapping("/create")
//    public List<Student> createStudent(@RequestBody List<Student> students){
//        System.out.println("Student list size " + students.size());
//        System.out.println(students);
//        return students;
//    }

//    @PostMapping("/create")
//    public Student createStudent(@RequestBody List<Student> students){
//        System.out.println("Student list size " + students.size());
//        System.out.println(students);
//        return students.get(0);
//    }

//    @PostMapping("/create")
//    public List<String> createStudent(@RequestBody List<Student> students){
//        List<String> foods = Arrays.asList("Pizza", "Burger");
//        return foods;
//    }

//      @PostMapping("/create")
//      public Map<String, Object> createStudent(@RequestBody List<Student> students){
//        Map<String, Object> data = new HashMap<>();
//        data.put("content", students);
//        data.put("error","No error found");
//        data.put("currentData", new Date());
//        return data;
//    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody List<Student> students) {
        Student student = students.get(0);
//        ResponseEntity<Student> response = new ResponseEntity<>(student, HttpStatus.CREATED);
        ResponseEntity<Student> response = ResponseEntity.status(HttpStatus.OK).body(student);
        return response;
    }

}
