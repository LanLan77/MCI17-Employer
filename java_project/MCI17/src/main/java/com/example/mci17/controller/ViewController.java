package com.example.mci17.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String index() {
        // 告诉Spring Boot当用户访问根URL时返回index.html页面
        return "index";
    }
}
