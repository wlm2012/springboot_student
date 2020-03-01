package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wlm
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/ListStudent")
    public List<Student> listStudent(String clazz){
        return studentService.listStudent(clazz);
    }


    @RequestMapping("/DeleteStudent")
    public void deleteStudent(int id){
        System.out.println(id);
    }


}
