package com.example.demo.service;

import com.example.demo.entity.Tiku;
import com.example.demo.mapper.TikuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wlm
 */

@Service
public class TikuService {

    @Autowired
    private TikuMapper TikuMapper;

    public List<Tiku> listTiku(String grade, String kemu) {
        var Tiku = TikuMapper.findTiku(grade, kemu);
        return Tiku;
    }

    public int deleteTikuById(int id) {
        return TikuMapper.deleteTikuById(id);
    }

    public void addTiku(Tiku Tiku) {
        TikuMapper.addTiku(Tiku);
    }

    public int updateTiku(Tiku Tiku) {
        return TikuMapper.updateTiku(Tiku);
    }
}
