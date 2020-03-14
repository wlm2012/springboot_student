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

    public List<Student> listStudent(Student student) {
        var students = studentMapper.findStudent(student);
        return students;
    }

    public int deleteStudentById(int id) {
        return studentMapper.deleteStudentById(id);
    }

    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }
}
