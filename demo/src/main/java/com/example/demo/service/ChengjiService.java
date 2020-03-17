package com.example.demo.service;

import com.example.demo.entity.Chengji;
import com.example.demo.entity.Chengjis;
import com.example.demo.entity.Clazz;
import com.example.demo.entity.Shijuan;
import com.example.demo.mapper.ChengjiMapper;
import com.example.demo.mapper.ClazzMapper;
import com.example.demo.mapper.ShijuanMapper;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wlm
 */

@Service
public class ChengjiService {

    @Autowired
    private ChengjiMapper ChengjiMapper;

    @Autowired
    private ShijuanMapper shijuanMapper;

    @Autowired
    private ClazzMapper clazzMapper;

    public List<Chengji> listChengji(Chengjis chengjis) {

        List<Shijuan> shijuans = null;
        if (!StringUtil.isEmpty(chengjis.getKemu()) || !StringUtil.isEmpty(chengjis.getName())) {
            Shijuan shijuan = new Shijuan();
            shijuan.setKemu(chengjis.getKemu());
            shijuan.setName(chengjis.getName());
            shijuans = shijuanMapper.findShijuan(shijuan);
        }


        List<Clazz> clazzes = null;
        if (!StringUtil.isEmpty(chengjis.getClazz()) || !StringUtil.isEmpty(chengjis.getGrade())) {
            clazzes = clazzMapper.findClazz(chengjis.getClazz(), chengjis.getGrade());
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Map<String, List> map = new HashMap<>();
        if (shijuans != null) {
            shijuans.forEach(s -> {
                arrayList.add(s.getId());
                map.put("shijuan_id", arrayList);
            });
        }

        ArrayList<Integer> list = new ArrayList<>();
        if (clazzes != null) {
            clazzes.forEach(s -> {
                list.add(s.getId());
                map.put("clazz_id", list);
            });
        }

        ArrayList<String> list1 = new ArrayList<>();
        if (!StringUtil.isEmpty(chengjis.getStudent_id())) {
            list1.add(chengjis.getStudent_id());
            map.put("student_id", list1);
        }

        return ChengjiMapper.findChengjis(map);
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
