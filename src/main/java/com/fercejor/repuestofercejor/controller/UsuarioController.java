package com.fercejor.repuestofercejor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fercejor.repuestofercejor.model.entity.CargoEntity;
import com.fercejor.repuestofercejor.model.entity.EmpleadoEntity;
import com.fercejor.repuestofercejor.model.service.inteface.ICargoService;
import com.fercejor.repuestofercejor.model.service.inteface.IEmpleadoService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private ICargoService cargoService;
    @RequestMapping("/")
    public String inicio(Model modelo){
        EmpleadoEntity empleado = new EmpleadoEntity();
        CargoEntity cargo = new CargoEntity();

        modelo.addAttribute("emplado", empleado);
        modelo.addAttribute("cargo", cargo);

        modelo.addAttribute("listaEmpleado", empleadoService.listaEmpleado());
        modelo.addAttribute("listaCargo", cargoService.listaCargo());
        return "administrador/usuarios";
    }
}
