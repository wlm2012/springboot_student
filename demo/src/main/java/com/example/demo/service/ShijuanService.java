package com.example.demo.service;

import com.example.demo.entity.Shijuan;
import com.example.demo.mapper.ShijuanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wlm
 */

@Service
public class ShijuanService {

    @Autowired
    private ShijuanMapper ShijuanMapper;

    public List<Shijuan> listShijuan(String clazz, String grade, String kemu) {
        var Shijuan = ShijuanMapper.findShijuan(clazz, grade, kemu);
        return Shijuan;
    }

    public int deleteShijuanById(int id) {
        return ShijuanMapper.deleteShijuanById(id);
    }

    public void addShijuan(Shijuan Shijuan) {
        ShijuanMapper.addShijuan(Shijuan);
    }

    public int updateShijuan(Shijuan Shijuan) {
        return ShijuanMapper.updateShijuan(Shijuan);
    }
}
