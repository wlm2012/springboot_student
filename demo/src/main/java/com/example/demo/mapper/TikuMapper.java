package com.example.demo.mapper;

import com.example.demo.entity.Tiku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wlm
 */

@Mapper
public interface TikuMapper {

    List<Tiku> findTiku(String grade,String kemu);

    int deleteTikuById(int id);

    void addTiku(Tiku Tiku);

    int updateTiku(Tiku Tiku);
}
