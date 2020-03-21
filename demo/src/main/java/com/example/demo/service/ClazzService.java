package com.example.demo.service;

import com.example.demo.entity.Clazz;
import com.example.demo.mapper.ClazzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wlm
 */

@Service
public class ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;

    public List<Clazz> listclazz(String clazz, String grade) {
        var clazzs = clazzMapper.findClazz(clazz, grade);
        return clazzs;
    }

    public int deleteclazzById(int id) {
        return clazzMapper.deleteClazzById(id);
    }

    public void addclazz(Clazz clazz) {
        clazzMapper.addClazz(clazz);
    }

    public int updateclazz(Clazz clazz) {
        return clazzMapper.updateClazz(clazz);
    }
}
