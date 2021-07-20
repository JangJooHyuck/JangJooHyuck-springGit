package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.emailChecker;

@Controller
public class APIController {
    @RequestMapping("/api/emailCheck")
    public String email_check() throws Exception{
        return "EmailCheck";
    }
}
