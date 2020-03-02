package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

//    @RequestMapping("/modifyStudent")
//    public ModelAndView addStudent(int id) {
//        return new ModelAndView("redirect:/modifyStudent?id=" + id);
//
//    }

}
