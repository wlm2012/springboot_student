package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.mapper.ClazzMapper;
import com.example.demo.mapper.KemuMapper;
import com.example.demo.mapper.TeacherClazzMapper;
import com.example.demo.mapper.TeacherMapper;
import com.example.demo.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wlm
 */

@Service
public class TeacherClazzService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private TeacherClazzMapper teacherClazzMapper;

    @Autowired
    private ClazzMapper clazzMapper;

    @Autowired
    private KemuMapper kemuMapper;

    public List<TeacherEntity> listTeacher(TeacherEntity teacher) {

        return teacherMapper.listTeacher(teacher);

    }

    public int deleteTeacherById(int kid) {
        return teacherClazzMapper.deleteTeacherClazzById(kid);
    }

    public void addTeacher(TeacherEntity teacher) {
        Integer teacher_id=teacher.getId();
        String clazz=teacher.getClazz();
        String grade=teacher.getGrade();
        String kemu=teacher.getKemu();
        Integer clazz_id = null;
        Integer kemu_id = null;
        List<Clazz> clazzList = clazzMapper.findClazz(clazz, grade);
        if (clazzList.size() == 1) {
            clazz_id = clazzList.get(0).getId();
        }
        List<Kemu> kemuList = kemuMapper.findKemu(kemu);
        if (kemuList.size() == 1) {
            kemu_id = kemuList.get(0).getId();
        }
        TeacherClazz teacherClazz = new TeacherClazz();
        teacherClazz.setKemu_id(kemu_id);
        teacherClazz.setClazz_id(clazz_id);
        teacherClazz.setTeacher_id(teacher_id);
        teacherClazz.setFlag(teacher.getFlag());
        teacherClazzMapper.addTeacherClazz(teacherClazz);

    }

    public int updateTeacher(TeacherEntity teacher) {
        String kemu = teacher.getKemu();
        String clazz = teacher.getClazz();
        String grade = teacher.getGrade();
        Integer clazz_id = null;
        Integer kemu_id = null;
        List<Clazz> clazzList = clazzMapper.findClazz(clazz, grade);
        if (clazzList.size() == 1) {
            clazz_id = clazzList.get(0).getId();
        }
        List<Kemu> kemuList = kemuMapper.findKemu(kemu);
        if (kemuList.size() == 1) {
            kemu_id = kemuList.get(0).getId();
        }
        TeacherClazz teacherClazz = new TeacherClazz();
        teacherClazz.setId(Integer.valueOf(teacher.getKid()));
        teacherClazz.setKemu_id(kemu_id);
        teacherClazz.setClazz_id(clazz_id);
        teacherClazz.setFlag(teacher.getFlag());
        return teacherClazzMapper.updateTeacherClazz(teacherClazz);

    }


    public void add(TeacherEntity teacher, int teacher_id) {
        String clazz = teacher.getClazz();
        String grade = teacher.getGrade();
        String kemu = teacher.getKemu();
        String[] ss = {clazz, grade, kemu};
        Integer kemu_id = null;
        Integer clazz_id = null;
        if (!StringUtil.isEmpty(ss)) {
            List<Kemu> list = kemuMapper.findKemu(kemu.trim());
            if (!list.isEmpty()) {
                kemu_id = list.get(0).getId();
            }

            List<Clazz> clazzList = clazzMapper.findClazz(clazz, grade);
            if (!clazzList.isEmpty()) {
                clazz_id = clazzList.get(0).getId();
            }
            if (kemu_id != null && clazz_id != null) {
                TeacherClazz teacherClazz = new TeacherClazz();
                teacherClazz.setClazz_id(clazz_id);
                teacherClazz.setTeacher_id(teacher_id);
                teacherClazz.setKemu_id(kemu_id);
                teacherClazzMapper.addTeacherClazz(teacherClazz);
            }
        }
    }
}
