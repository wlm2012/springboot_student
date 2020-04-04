package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.mapper.*;
import com.example.demo.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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

    // @Autowired
    // private StudentMapper studentMapper;

    @Autowired
    private ChengjiMapper chengjiMapper;

    public List<Tiku> listTiku(Tiku tiku) {
        var Tiku = TikuMapper.findTiku(tiku);
        return Tiku;
    }

    public List<Tiku> listTikus(List<String> list) {
        var Tiku = TikuMapper.findTikus(list);
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
        } else if (StringUtil.isEmpty(kemu)) {
            result = "答案不能为空";
        } else {
            var kemus = kemuMapper.findKemu(kemu);
            if (kemus.isEmpty()) {
                result = "没有相应科目";
            }
        }

        if (StringUtil.isEmpty(grade)) {
            result = "年级不能为空";
        } else {
            var clazzes = clazzMapper.findClazz("", grade);
            if (clazzes.isEmpty()) {
                result = "没有相应年级";
            }
        }
        if (result.equals("success")) {
            TikuMapper.addTiku(Tiku);
        }

        return result;
    }

    public int updateTiku(Tiku Tiku) {
        String question = Tiku.getQuestion();
        question = question.replaceAll("[\\t\\n\\r]+", "<br>");
        Tiku.setQuestion(question);

        return TikuMapper.updateTiku(Tiku);
    }


    public String addTikus(Questions questions) {
        System.out.println(questions.getStudent_id());
        List<Answer> list = questions.getQuestionList();
        AtomicInteger results = new AtomicInteger();
        list.forEach(s -> {
                    Tiku tiku = new Tiku();
                    tiku.setId(s.getId());
                    var tikus = TikuMapper.findTiku(tiku);
                    if (s.getAnswer().equals(tikus.get(0).getAnswer())) {
                        results.addAndGet(2);
                    }
                }
        );
        int result = results.get();
        Chengji chengji = new Chengji();
        chengji.setStudent_id(questions.getStudent_id());
        chengji.setResult(String.valueOf(result));
        chengji.setShijuan_id(questions.getShijuan_id());
        var student_id = questions.getStudent_id();
        Student student = new Student();
        student.setId(student_id);
        // var students = studentMapper.findStudent(student);
        var clazz_id = clazzMapper.findClazz(student.getClazz(), student.getGrade()).get(0).getId();
        chengji.setClazz_id(clazz_id);
        chengjiMapper.addChengji(chengji);
        return String.valueOf(result);
    }
}
