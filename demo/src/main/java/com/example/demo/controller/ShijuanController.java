package com.example.demo.controller;


import com.example.demo.entity.Shijuan;
import com.example.demo.service.ShijuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wlm
 */
@RestController
public class ShijuanController {

    @Autowired
    private ShijuanService ShijuanService;

    @RequestMapping("/ListShijuan")
    public List<Shijuan> listShijuan(String clazz, String grade, String kemu) {
        return ShijuanService.listShijuan(clazz, grade, kemu);
    }


    @RequestMapping("/DeleteShijuan")
    public String deleteShijuan(int id) {
        int result = ShijuanService.deleteShijuanById(id);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/AddShijuan")
    public String addShijuan(Shijuan Shijuan) {
        ShijuanService.addShijuan(Shijuan);
        return "success";
    }

    @RequestMapping("/UpdateShijuan")
    public String updateShijuan(Shijuan Shijuan) {
        int result = ShijuanService.updateShijuan(Shijuan);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }


}
