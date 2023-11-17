package com.fercejor.repuestofercejor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/")
    public String inicio(){
        return "login/Login";
    }
    @RequestMapping("/restablecer")
    public String restablecer(){
        return "login/RestablecerContra";
    }
}
