package com.fercejor.repuestofercejor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventas")
public class VentaController {
    @RequestMapping("/")
    public String inicio(){
        return "administrador/ventas";
    }
}
