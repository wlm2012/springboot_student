package com.example.demo.service;

import com.example.demo.entity.Kemu;
import com.example.demo.mapper.KemuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wlm
 */

@Service
public class KemuService {

    @Autowired
    private KemuMapper KemuMapper;

    public List<Kemu> listKemu(String miaoshu) {
        var Kemu = KemuMapper.findKemu(miaoshu);
        return Kemu;
    }

    public int deleteKemuById(int id) {
        return KemuMapper.deleteKemuById(id);
    }

    public void addKemu(Kemu Kemu) {
        KemuMapper.addKemu(Kemu);
    }

    public int updateKemu(Kemu Kemu) {
        return KemuMapper.updateKemu(Kemu);
    }
}
