package com.example.demo.controller;


import com.example.demo.entity.Shijuan;
import com.example.demo.entity.Student;
import com.example.demo.entity.Timu;
import com.example.demo.entity.Timus;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.ShijuanService;
import com.example.demo.service.StudentService;
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

    Autowired
    private StudentService studentService;

    @RequestMapping("/ListShijuan")
    public List<Shijuan> listShijuan(Shijuan shijuan) {
        return ShijuanService.listShijuan(shijuan);
    }

    @RequestMapping("/ListShijuanById")
    public List<Shijuan> ListShijuanById(Student student) {
        var students = studentService.listStudent(student);
        if (students.size()==1){

        }else {
            return null;
        }
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
