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

    public List<Teacher> listTeacher(String name, String flag) {
        var Teacher = TeacherMapper.findTeacher(name, flag);
        return Teacher;
    }

    public int deleteTeacherById(int id) {
        return TeacherMapper.deleteTeacherById(id);
    }

    public void addTeacher(Teacher teacher) {
        TeacherMapper.addTeacher(teacher);
    }

    public int updateTeacher(Teacher teacher) {
        return TeacherMapper.updateTeacher(teacher);
    }
}