package com.example.StudentRestAPIs.controller;

import com.example.StudentRestAPIs.Service.StudentService;
import com.example.StudentRestAPIs.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    //    @GetMapping("/food")
    // writing a method inside a class
    @GetMapping("/name")
    public String name() {
        return "Adeyinka Elizabeth is a young lady full of life";
    }

    @GetMapping("/food")
    public String rice() {
        return "I love eating rice";
    }

    @GetMapping("/males")
    public List<Student> getMalesList(){
        return studentService.getMales();
    }
    @GetMapping("/females")
    public List<Student> getFemalesList() {
        return studentService.getfemales();
    }
}
