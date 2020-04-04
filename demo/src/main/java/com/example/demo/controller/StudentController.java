package com.example.demo.controller;


import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Student> listStudent(Student student) {
        return studentService.listStudent(student);
    }


    @RequestMapping("/DeleteStudent")
    public String deleteStudent(int id) {
        int result = studentService.deleteStudentById(id);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/AddStudent")
    public String addStudent(Student student) {
        studentService.addStudent(student);
        return "success";
    }

    @RequestMapping("/UpdateStudent")
    public String updateStudent(Student student) {
        int result = studentService.updateStudent(student);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }


}
