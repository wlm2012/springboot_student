package com.example.demo.controller;


import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wlm
 */
@RestController
public class TeacherController {

    @Autowired
    private TeacherService TeacherService;

    @RequestMapping("/ListTeacher")
    public List<Teacher> listTeacher(String name, String flag) {
        return TeacherService.listTeacher(name, flag);
    }


    @RequestMapping("/DeleteTeacher")
    public String deleteTeacher(int id) {
        int result = TeacherService.deleteTeacherById(id);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/AddTeacher")
    public String addTeacher(Teacher Teacher) {
        TeacherService.addTeacher(Teacher);
        return "success";
    }

    @RequestMapping("/UpdateTeacher")
    public String updateTeacher(Teacher Teacher) {
        int result = TeacherService.updateTeacher(Teacher);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }


}
