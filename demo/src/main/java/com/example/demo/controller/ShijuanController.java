package com.example.demo.controller;


import com.example.demo.entity.*;
import com.example.demo.service.ShijuanService;
import com.example.demo.service.TikuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wlm
 */
@RestController
public class ShijuanController {

    @Autowired
    private ShijuanService ShijuanService;

    @Autowired
    private TikuService tikuService;


    @RequestMapping("/ListShijuan")
    public List<Shijuan> listShijuan(Shijuan shijuan) {
        return ShijuanService.listShijuan(shijuan);
    }

    @RequestMapping("/ListShijuans")
    public List<Shijuan> listShijuans(Shijuan shijuan, String student_id) {

        return ShijuanService.listShijuans(shijuan, student_id);
    }

    @RequestMapping("/ListShijuanTimu")
    public List<Question> listShijuanTimu(Shijuan shijuan) {

        var shijuans = ShijuanService.listShijuan(shijuan);
        String question_id = shijuans.get(0).getQuestion_id();
        String[] question_ids = question_id.split(",");
        var tikus = tikuService.listTikus(Arrays.asList(question_ids));
        List<Question> list = new ArrayList<>();
        for (Tiku tiku : tikus) {
            Question question = new Question();
            question.setId(tiku.getId());
            question.setQuestion(tiku.getQuestion());
            question.setAnswers(tiku.getAnswers().split(","));
            list.add(question);
        }
        return list;
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
    public Timus addShijuan(Shijuan shijuan) {
        return ShijuanService.addShijuan(shijuan);
    }

    @RequestMapping("/UpdateShijuan")
    public String updateShijuan(Shijuan Shijuan) {
        int result = ShijuanService.updateShijuan(Shijuan);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/UpdateQuestion")
    public String updateQuestion(Shijuan shijuan) {
        int result = ShijuanService.updateQuestion(shijuan);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }


}
