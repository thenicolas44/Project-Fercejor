package com.fercejor.repuestofercejor.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fercejor.repuestofercejor.model.entity.CbzCompraEntity;
import com.fercejor.repuestofercejor.model.service.inteface.ICbzCompraService;
import com.fercejor.repuestofercejor.model.service.inteface.IProductoService;
import com.fercejor.repuestofercejor.model.service.inteface.IProveedorService;

@Controller
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private ICbzCompraService cbzCompraService;
    @Autowired
    private IProductoService productoService;
    @Autowired
    private IProveedorService proveedorService;


    @RequestMapping("/")
    public String inicio(Model modelo){
        CbzCompraEntity cbzCompraEntity = new CbzCompraEntity();

        modelo.addAttribute("cabezeraCompra", cbzCompraEntity);

        modelo.addAttribute("listaCompras", cbzCompraService.listarCabezeraCompra());
        modelo.addAttribute("listaProductos", productoService.listaProductos());
        modelo.addAttribute("listarProveedor", proveedorService.listaProveedor());
        return "administrador/compras";
    }

    @RequestMapping("/guardar")
    public String guardar(CbzCompraEntity cbzCompra){

        //Generar ID de la Cabezera
        List<CbzCompraEntity> ListCbzCompra = cbzCompraService.listarCabezeraCompra();
        if(ListCbzCompra.size() == 0){
            String id_cbzCompra = "CZCM0001";
            cbzCompra.setIdCbzCompra(id_cbzCompra);
        }
        else{
            CbzCompraEntity ultimCbzCompra = ListCbzCompra.get(ListCbzCompra.size()-1);
            String ultimoID = ultimCbzCompra.getIdCbzCompra();
            int numero = Integer.parseInt(ultimoID.substring(4));
            numero++;
            String nuevoID = String.format("CZCM%04d", numero);
            cbzCompra.setIdCbzCompra(nuevoID);
        }
        LocalDate fechaActual = LocalDate.now();
        
        Date dateFechaActual = java.sql.Date.valueOf(fechaActual);
        cbzCompra.setFechaCbzCompra(dateFechaActual);
        cbzCompraService.guardarCabezeraCompra(cbzCompra);
        
        return "redirect:/compras/";
    }
}
