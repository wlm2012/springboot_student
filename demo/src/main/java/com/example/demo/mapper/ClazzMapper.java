package com.example.demo.mapper;

import com.example.demo.entity.Clazz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface ClazzMapper {

    List<Clazz> findClazz(String clazz,String grade);

    int deleteClazzById(int id);

    void addClazz(Clazz clazz);

    int updateClazz(Clazz clazz);
}
