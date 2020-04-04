package com.example.demo.mapper;

import com.example.demo.entity.TeacherClazz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface TeacherClazzMapper {

    List<TeacherClazz> findTeacherClazz(TeacherClazz teacherClazz);

    int deleteTeacherClazzById(int id);

    void addTeacherClazz(TeacherClazz TeacherClazz);

    int updateTeacherClazz(TeacherClazz TeacherClazz);
}
