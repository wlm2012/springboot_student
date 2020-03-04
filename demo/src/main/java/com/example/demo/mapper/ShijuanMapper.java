package com.example.demo.mapper;

import com.example.demo.entity.Shijuan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface ShijuanMapper {

    List<Shijuan> findShijuan(String clazz,String grade,String kemu);

    int deleteShijuanById(int id);

    void addShijuan(Shijuan Shijuan);

    int updateShijuan(Shijuan Shijuan);
}
