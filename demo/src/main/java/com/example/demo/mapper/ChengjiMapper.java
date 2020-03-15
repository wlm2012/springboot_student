package com.example.demo.mapper;

import com.example.demo.entity.Chengji;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface ChengjiMapper {

    List<Chengji> findChengji(Chengji Chengji);

    int deleteChengjiById(int id);

    void addChengji(Chengji Chengji);

    int updateChengji(Chengji Chengji);
}
