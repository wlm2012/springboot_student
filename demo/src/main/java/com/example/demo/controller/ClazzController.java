package com.example.demo.controller;


import com.example.demo.entity.Clazz;
import com.example.demo.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wlm
 */
@RestController
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @RequestMapping("/Listclazz")
    public List<Clazz> listclazz(String clazz, String grade) {
        return clazzService.listclazz(clazz, grade);
    }


    @RequestMapping("/Deleteclazz")
    public String deleteclazz(int id) {
        int result = clazzService.deleteclazzById(id);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }

    @RequestMapping("/Addclazz")
    public String addclazz(Clazz clazz) {
        clazzService.addclazz(clazz);
        return "success";
    }

    @RequestMapping("/UpdateClazz")
    public String updateclazz(Clazz clazz) {
        int result = clazzService.updateclazz(clazz);
        if (1 == result) {
            return "success";
        }
        return "fail";
    }


}
