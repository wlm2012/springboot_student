package com.example.demo.service;

import com.example.demo.entity.Teacher;
import com.example.demo.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wlm
 */

@Service
public class TeacherService {

    @Autowired
    private TeacherMapper TeacherMapper;

    public List<Teacher> listTeacher(Teacher teacher) {
        var Teachers = TeacherMapper.findTeacher(teacher);
        return Teachers;
    }

    public int deleteTeacherById(int id) {
        return TeacherMapper.deleteTeacherById(id);
    }

    public void addTeacher(Teacher Teacher) {
        TeacherMapper.addTeacher(Teacher);
    }

    public int updateTeacher(Teacher Teacher) {
        return TeacherMapper.updateTeacher(Teacher);
    }
}
