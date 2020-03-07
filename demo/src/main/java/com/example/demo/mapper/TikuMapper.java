package com.example.demo.mapper;

import com.example.demo.entity.Tiku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface TikuMapper {

    List<Tiku> findTiku(Tiku tiku);

    int deleteTikuById(int id);

    void addTiku(Tiku Tiku);

    int updateTiku(Tiku Tiku);
}
