package com.fercejor.repuestofercejor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fercejor.repuestofercejor.model.entity.ClienteEntity;
import com.fercejor.repuestofercejor.model.service.inteface.IClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @RequestMapping("/")
    public String inicio(Model modelo){
        ClienteEntity cliente = new ClienteEntity();
        modelo.addAttribute("cliente", cliente);
        modelo.addAttribute("listaCliente", clienteService.listarCliente());
        return "administrador/clientes";
    }
    @RequestMapping("/editarCliente")
    public String editarCliente(ClienteEntity cliente){
        clienteService.guardarCliente(cliente);
        return "redirect:/clientes/";
    }
}
