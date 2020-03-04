package com.example.demo.mapper;

import com.example.demo.entity.Shijuan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface ShijuanMapper {

    List<Shijuan> findShijuan(Shijuan Shijuan);

    int deleteShijuanById(int id);

    void addShijuan(Shijuan Shijuan);

    int updateShijuan(Shijuan Shijuan);
}
