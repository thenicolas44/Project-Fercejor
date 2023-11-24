package com.fercejor.repuestofercejor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fercejor.repuestofercejor.model.service.inteface.IClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @RequestMapping("/")
    public String inicio(Model modelo){
        modelo.addAttribute("listaCliente", clienteService.listarCliente());
        return "administrador/clientes";
    }
}
