package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

public class APIController {
    @RequestMapping("/api/")
    public String GetEmail(){
        
    }
    @RequestMapping("/api/emailCheck")
    public String email_check() throws Exception{
        return "EmailCheck";
    }
}
