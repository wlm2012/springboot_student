package com.example.demo.controller;


import com.example.demo.entity.Chengji;
import com.example.demo.entity.Chengjis;
import com.example.demo.entity.Questions;
import com.example.demo.service.ChengjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wlm
 */
@RestController
public class ChengjiController {

    @Autowired
    private ChengjiService ChengjiService;

    @RequestMapping("/ListChengji")
    public List<Chengji> listChengji(Chengjis chengjis) {
        return ChengjiService.listChengji(chengjis);
    }


    @RequestMapping("/DeleteChengji")
    public String deleteChengji(int id) {
        int result = ChengjiService.deleteChengjiById(id);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/AddChengji")
    public String addChengji(Questions questions) {


        return "success";
    }

    @RequestMapping("/UpdateChengji")
    public String updateChengji(Chengji Chengji) {
        int result = ChengjiService.updateChengji(Chengji);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }


}
