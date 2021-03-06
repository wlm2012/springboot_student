package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wlm
 */
@Controller
public class HtmlController {

    @RequestMapping("/listStudent")
    public String listStudent() {
        return "listStudent";
    }

    @RequestMapping("/listClazz")
    public String listClazz() {
        return "listClazz";
    }

    @RequestMapping("/listKemu")
    public String listKemu() {
        return "listKemu";
    }

    @RequestMapping("/listTeacher")
    public String listTeacher() {
        return "listTeacher";
    }

    @RequestMapping("/listTiku")
    public String listTiku() {
        return "listTiku";
    }

    @RequestMapping("/listShijuan")
    public String listShijuan() {
        return "listShijuan";
    }

    @RequestMapping("/addShijuan")
    public String addShijuan() {
        return "addShijuan";
    }

    @RequestMapping("/listTeacherClazz")
    public String listTeacherClazz() {
        return "listTeacherClazz";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/kaoshi")
    public String kaoshi() {
        return "kaoshi";
    }

    @RequestMapping("/listChengji")
    public String listChengji() {
        return "listChengji";
    }

    @RequestMapping("/Chengji")
    public String chengji() {
        return "Chengji";
    }

    @RequestMapping("/left")
    public String left() {
        return "left";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    // @RequestMapping("/modifyStudent")
    // public ModelAndView addStudent(int id) {
    // return new ModelAndView("redirect:/modifyStudent?id=" + id);
    //
    // }

}
