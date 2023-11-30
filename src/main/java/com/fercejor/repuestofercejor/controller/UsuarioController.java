package com.fercejor.repuestofercejor.controller;

import java.util.List;

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

        modelo.addAttribute("empleado", empleado);
        modelo.addAttribute("cargo", cargo);

        modelo.addAttribute("listaEmpleado", empleadoService.listaEmpleado());
        modelo.addAttribute("listaCargo", cargoService.listaCargo());
        return "administrador/usuarios";
    }
    @RequestMapping("/guardarCargo")
    public String guardarCargo(CargoEntity cargo){
        List<CargoEntity> listaCargo = cargoService.listaCargo();
        if(listaCargo.size() == 0){
            String id_cargo = "CARG0001";
            cargo.setIdCargo(id_cargo);
        }
        else{
            CargoEntity ultimoCargo = listaCargo.get(listaCargo.size()-1);
            String ultimoID = ultimoCargo.getIdCargo();
            int numero = Integer.parseInt(ultimoID.substring(4));
            numero++;
            String nuevoID = String.format("CARG%04d", numero);
            cargo.setIdCargo(nuevoID);
        }
        cargoService.guardarCargo(cargo);
        return "redirect:/usuarios/";
    }
    @RequestMapping("/guardarEmpleado")
    public String guardarEmpleado(EmpleadoEntity empleado){
        List<EmpleadoEntity> listaEmpleado = empleadoService.listaEmpleado();
        if(listaEmpleado.size() == 0){
            String id_empleado = "EMPL0001";
            empleado.setIdEmpleado(id_empleado);
        }
        else{
            EmpleadoEntity ultimoEmpleado = listaEmpleado.get(listaEmpleado.size()-1);
            String ultimoId = ultimoEmpleado.getIdEmpleado();
            int num = Integer.parseInt(ultimoId.substring(4));
            num++;
            String nuevoId = String.format("EMPL%04d", num);
            empleado.setIdEmpleado(nuevoId);
        }
        empleadoService.guardarEmpleado(empleado);
        return "redirect:/usuarios/";
    }

    @RequestMapping("/editarCargo")
    public String editarCargo(CargoEntity cargo){
        cargoService.guardarCargo(cargo);
        return "redirect:/usuarios/";
    }
    @RequestMapping("/editarEmpleado")
    public String editarEmpleado(EmpleadoEntity empleado){
        empleadoService.guardarEmpleado(empleado);
        return "redirect:/usuarios/";
    }
}
