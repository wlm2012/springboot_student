package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wlm
 */

@Service
public class StudentService {


    public List<Student> listStudent() {
        var student = new ArrayList<Student>();
        return student;
    }
}
