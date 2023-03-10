package com.bte.java8.casinodemo.controller;

import com.bte.java8.casinodemo.service.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/user/add")
    public String getRegistrationPage() {
        return "add-user";
    }

}
