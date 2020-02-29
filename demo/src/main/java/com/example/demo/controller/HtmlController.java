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


}
