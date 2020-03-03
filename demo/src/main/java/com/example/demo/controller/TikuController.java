package com.example.demo.controller;


import com.example.demo.entity.Tiku;
import com.example.demo.service.TikuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wlm
 */
@RestController
public class TikuController {

    @Autowired
    private TikuService TikuService;

    @RequestMapping("/ListTiku")
    public List<Tiku> listTiku(String grade, String kemu) {
        return TikuService.listTiku(grade, kemu);
    }


    @RequestMapping("/DeleteTiku")
    public String deleteTiku(int id) {
        int result = TikuService.deleteTikuById(id);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/AddTiku")
    public String addTiku(Tiku Tiku) {
        String result = TikuService.addTiku(Tiku);
        return result;
    }

    @RequestMapping("/UpdateTiku")
    public String updateTiku(Tiku Tiku) {
        int result = TikuService.updateTiku(Tiku);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }


}
