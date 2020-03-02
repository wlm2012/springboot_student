package com.example.demo.mapper;

import com.example.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface TeacherMapper {

    List<Teacher> findTeacher(String name,String flag);

    int deleteTeacherById(int id);

    void addTeacher(Teacher Teacher);

    int updateTeacher(Teacher Teacher);
}
