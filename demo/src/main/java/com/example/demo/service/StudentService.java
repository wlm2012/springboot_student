package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wlm
 */

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> listStudent(String clazz) {
        var student=studentMapper.findStudentByClazz(clazz);
        return student;
    }
}
