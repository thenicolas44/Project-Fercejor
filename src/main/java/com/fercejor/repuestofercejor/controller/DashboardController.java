package com.fercejor.repuestofercejor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fercejor")
public class DashboardController {
    @RequestMapping("/")
    public String inicio(){
        return "administrador/principal";
    }
}
