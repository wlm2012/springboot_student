package com.example.demo.mapper;

import com.example.demo.entity.Kemu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface KemuMapper {

    List<Kemu> findKemu(String miaoshu);

    int deleteKemuById(int id);

    void addKemu(Kemu kemu);

    int updateKemu(Kemu kemu);
}
