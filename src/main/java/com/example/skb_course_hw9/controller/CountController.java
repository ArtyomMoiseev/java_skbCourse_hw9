package com.example.skb_course_hw9.controller;

import jdk.jfr.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.html.parser.Entity;

@Controller
public class CountController {

    @GetMapping("/count")
    @ResponseBody
    public String count() {
        return "OK";
    }
}
