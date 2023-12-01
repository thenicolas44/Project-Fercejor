package com.fercejor.repuestofercejor.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fercejor.repuestofercejor.model.entity.CbzVentaEntity;
import com.fercejor.repuestofercejor.model.entity.ClienteEntity;
import com.fercejor.repuestofercejor.model.service.inteface.ICbzVentaService;
import com.fercejor.repuestofercejor.model.service.inteface.IClienteService;
import com.fercejor.repuestofercejor.model.service.inteface.IEmpleadoService;
import com.fercejor.repuestofercejor.model.service.inteface.IProductoService;

@Controller
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private ICbzVentaService cbzVentaService;
    @Autowired
    private IProductoService productoService;
    @Autowired
    private IEmpleadoService empleadoService;
    @Autowired
    private IClienteService clienteService;
    @RequestMapping("/")
    public String inicio(Model modelo){
        CbzVentaEntity cbzVentaEntity = new CbzVentaEntity();

        modelo.addAttribute("cabezeraVenta", cbzVentaEntity);
        
        modelo.addAttribute("listaCliente", clienteService.listarCliente());
        modelo.addAttribute("listaProducto", productoService.listaProductos());
        modelo.addAttribute("listaVentas", cbzVentaService.listarCabecerVenta());
        modelo.addAttribute("listaEmpleado", empleadoService.listaEmpleado());
        return "administrador/ventas";
    }

    @RequestMapping("/guardar")
    public String guardar(CbzVentaEntity cbzVenta){
        //Genera ID del cliente
        ClienteEntity clienteVenta = cbzVenta.getClienteCbzVenta();
        List<ClienteEntity> listaCliente =clienteService.listarCliente();
        if(listaCliente.size() == 0){
            String id_cliente = "CLIE0001";
            clienteVenta.setIdCliente(id_cliente);
        }
        else{
            ClienteEntity ultimoCliente = listaCliente.get(listaCliente.size()-1);
            String ultimoID = ultimoCliente.getIdCliente();
            int numero = Integer.parseInt(ultimoID.substring(4));
            numero++;
            String nuevoID = String.format("CLIE%04d", numero);
            clienteVenta.setIdCliente(nuevoID);
        }
        clienteService.guardarCliente(clienteVenta);
        //devolver el cliente a la venta
        cbzVenta.setClienteCbzVenta(clienteVenta);


        //manejo de ID de la Venta
        List<CbzVentaEntity> listaCbzVenta = cbzVentaService.listarCabecerVenta();
        if(listaCbzVenta.size() == 0){
            String id_cbzVenta = "CZVT0001";
            cbzVenta.setIdCbzVenta(id_cbzVenta);
        }
        else{
            CbzVentaEntity ultimoCbzVenta = listaCbzVenta.get(listaCbzVenta.size()-1);
            String ultimoVentaID = ultimoCbzVenta.getIdCbzVenta();
            int num = Integer.parseInt(ultimoVentaID.substring(4));
            num++;
            String nuevoVentaID = String.format("CZVT%04d", num);
            cbzVenta.setIdCbzVenta(nuevoVentaID);
        }
        LocalDate fechaActual = LocalDate.now();
        Date dateFechaActual = java.sql.Date.valueOf(fechaActual);
        cbzVenta.setFechaCbzVenta(dateFechaActual);
        cbzVentaService.guardarCabezeraVenta(cbzVenta);
        return "redirect:/ventas/"; 
    }

    @RequestMapping("/editarVentas")
    public String editarVentas(CbzVentaEntity venta){
        CbzVentaEntity ventaEncontrar = cbzVentaService.ventaEncontrar(venta.getIdCbzVenta());
        Date fechaReserva = ventaEncontrar.getFechaCbzVenta();
        venta.setFechaCbzVenta(fechaReserva);
        cbzVentaService.guardarCabezeraVenta(venta);
        return "redirect:/ventas/"; 
    }

    @GetMapping("/vista/")
    public String listaVent(Model modelo){
        List<CbzVentaEntity> listaVentas = cbzVentaService.listarCabecerVenta();
        modelo.addAttribute("listadoVenta", listaVentas);
        return "/ventas/vista/lista";
    }
}
