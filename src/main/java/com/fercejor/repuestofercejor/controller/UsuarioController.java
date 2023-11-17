package com.fercejor.repuestofercejor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @RequestMapping("/")
    public String inicio(){
        return "administrador/usuarios";
    }
}
