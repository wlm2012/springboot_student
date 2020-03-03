package com.example.demo.service;

import com.example.demo.entity.Tiku;
import com.example.demo.mapper.ClazzMapper;
import com.example.demo.mapper.KemuMapper;
import com.example.demo.mapper.TikuMapper;
import com.example.demo.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wlm
 */

@Service
public class TikuService {

    @Autowired
    private TikuMapper TikuMapper;

    @Autowired
    private KemuMapper kemuMapper;

    @Autowired
    private ClazzMapper clazzMapper;

    public List<Tiku> listTiku(String grade, String kemu) {
        var Tiku = TikuMapper.findTiku(grade, kemu);
        return Tiku;
    }

    public int deleteTikuById(int id) {
        return TikuMapper.deleteTikuById(id);
    }

    public String addTiku(Tiku Tiku) {
        String result = "success";
        String question = Tiku.getQuestion();
        String answer = Tiku.getAnswer();
        String grade = Tiku.getGrade();
        String kemu = Tiku.getKemu();
        if (StringUtil.isEmpty(question)) {
            result = "问题不能为空";
        } else {
            question = question.replaceAll("[\\t\\n\\r]+", "<br>");
            Tiku.setQuestion(question);
        }

        if (StringUtil.isEmpty(answer)) {
            result = "答案不能为空";
        } else {
            answer = answer.toLowerCase();
            Tiku.setAnswer(answer);
        }

        if (StringUtil.isEmpty(kemu)) {
            result = "答案不能为空";
        } else {
            var kemus = kemuMapper.findKemu(kemu);
            if (kemus.isEmpty()) {
                result="没有相应科目";
            }
        }

        if (StringUtil.isEmpty(grade)) {
            result = "年级不能为空";
        } else {
            var clazzes = clazzMapper.findClazz("",grade);
            if (clazzes.isEmpty()) {
                result="没有相应年级";
            }
        }
        if(result.equals("success")){
            TikuMapper.addTiku(Tiku);
        }

        return result;
    }

    public int updateTiku(Tiku Tiku) {
        return TikuMapper.updateTiku(Tiku);
    }
}
