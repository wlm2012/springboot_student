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

    @RequestMapping("/addStudent")
    public String addStudent(Integer id) {
        if (id==null){
            new ModelAndView("redirect:/addStudent?id="+id);
        }
        return "addStudent";
    }

}
