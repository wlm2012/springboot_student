package com.example.demo.service;

import com.example.demo.entity.Chengji;
import com.example.demo.mapper.ChengjiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wlm
 */

@Service
public class ChengjiService {

    @Autowired
    private ChengjiMapper ChengjiMapper;

    public List<Chengji> listChengji(Chengji chengji) {
        var Chengji = ChengjiMapper.findChengji(chengji);
        return Chengji;
    }

    public int deleteChengjiById(int id) {
        return ChengjiMapper.deleteChengjiById(id);
    }

    public void addChengji(Chengji Chengji) {
        ChengjiMapper.addChengji(Chengji);
    }

    public int updateChengji(Chengji Chengji) {
        return ChengjiMapper.updateChengji(Chengji);
    }
}
