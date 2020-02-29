package com.example.demo.controller;


import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wlm
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;




}
