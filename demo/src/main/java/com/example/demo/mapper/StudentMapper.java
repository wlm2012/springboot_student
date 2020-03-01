package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface StudentMapper {

    List<Student> findStudentByClazz(String clazz,String grade);

    int deleteStudentById(int id);

    void insertStudent(Student student);
}
