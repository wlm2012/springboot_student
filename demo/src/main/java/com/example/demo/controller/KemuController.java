package com.example.demo.controller;


import com.example.demo.entity.Kemu;
import com.example.demo.service.KemuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wlm
 */
@RestController
public class KemuController {

    @Autowired
    private KemuService KemuService;

    @RequestMapping("/ListKemu")
    public List<Kemu> listKemu(String miaoshu) {
        return KemuService.listKemu(miaoshu);
    }


    @RequestMapping("/DeleteKemu")
    public String deleteKemu(int id) {
        int result = KemuService.deleteKemuById(id);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/AddKemu")
    public String addKemu(Kemu Kemu) {
        KemuService.addKemu(Kemu);
        return "success";
    }

    @RequestMapping("/UpdateKemu")
    public String updateKemu(Kemu Kemu) {
        int result = KemuService.updateKemu(Kemu);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }


}
