package com.example.demo.mapper;

import com.example.demo.entity.Teacher;
import com.example.demo.entity.TeacherEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface TeacherMapper {

    List<Teacher> findTeacher(Teacher teacher);

    int deleteTeacherById(int id);

    int addTeacher(Teacher Teacher);

    int updateTeacher(Teacher Teacher);

    List<TeacherEntity> listTeacher(TeacherEntity teacherEntity);
}
