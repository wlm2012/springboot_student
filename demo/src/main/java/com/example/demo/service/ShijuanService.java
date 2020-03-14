package com.example.demo.service;

import com.example.demo.entity.Shijuan;
import com.example.demo.entity.Tiku;
import com.example.demo.entity.Timu;
import com.example.demo.entity.Timus;
import com.example.demo.mapper.ShijuanMapper;
import com.example.demo.mapper.TikuMapper;
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

    @Autowired
    private TikuMapper tikuMapper;

    public List<Shijuan> listShijuan(Shijuan shijuan) {
        var Shijuan = ShijuanMapper.findShijuan(shijuan);
        return Shijuan;
    }

    public int deleteShijuanById(int id) {
        return ShijuanMapper.deleteShijuanById(id);
    }

    public Timus addShijuan(Shijuan shijuan) {
        String question_id = "";
        if (null == shijuan.getId()) {
            ShijuanMapper.addShijuan(shijuan);
        } else {
            shijuan = ShijuanMapper.findShijuan(shijuan).get(0);
            question_id=shijuan.getQuestion_id();
        }
        String id = shijuan.getId();

        Tiku tiku = new Tiku();
        tiku.setGrade(shijuan.getGrade());
        System.out.println(shijuan.toString());
        tiku.setKemu(shijuan.getKemu());
        List<Tiku> tikus = tikuMapper.findTiku(tiku);
        String[] queations = question_id.split(";");
        Timus timus = new Timus();
        timus.setId(id);
        List<Timu> timuList = new ArrayList<>();

        tikus.forEach(s -> {
            Timu timu = new Timu();
            timu.setId(s.getId());
            timu.setQuestion(s.getQuestion());
            boolean checked = false;
            for (String question : queations) {
                if (s.getId().trim().equals(question)) {
                    checked = true;
                }
            }
            timu.setChecked(checked);
            timuList.add(timu);
        });
        timus.setList(timuList);
        return timus;
    }

    public int updateShijuan(Shijuan shijuan) {
        return ShijuanMapper.updateShijuan(shijuan);
    }


    public int updateQuestion(Shijuan shijuan) {
        return ShijuanMapper.updateShijuan(shijuan);
    }
}
