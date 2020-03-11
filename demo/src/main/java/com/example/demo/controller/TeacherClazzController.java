package com.example.demo.controller;


import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherEntity;
import com.example.demo.service.TeacherClazzService;
import com.example.demo.service.TeacherService;
import com.example.demo.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wlm
 */
@RestController
public class TeacherClazzController {

    @Autowired
    private TeacherClazzService teacherClazzServiceService;

    @RequestMapping("/ListTeacherClazz")
    public List<TeacherEntity> listTeacher(TeacherEntity teacher) {
        return teacherClazzServiceService.listTeacher(teacher);
    }


    @RequestMapping("/DeleteTeacherClazz")
    public String deleteTeacher(int id) {
        int result = teacherClazzServiceService.deleteTeacherById(id);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/AddTeacherClazz")
    public String addTeacher(TeacherEntity Teacher) {
        teacherClazzServiceService.addTeacher(Teacher);
        return "success";
    }

    @RequestMapping("/UpdateTeacherClazz")
    public String updateTeacher(TeacherEntity teacher) {
        String kid = teacher.getKid();
        if (!StringUtil.isEmpty(kid)) {
            teacherClazzServiceService.updateTeacher(teacher);
        } else {
            teacherClazzServiceService.addTeacher(teacher);
        }
        return "success";

    }


}
