package com.fercejor.repuestofercejor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/compras")
public class CompraController {
    @RequestMapping("/")
    public String inicio(){
        return "administrador/compras";
    }
}
