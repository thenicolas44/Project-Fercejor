package com.fercejor.repuestofercejor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fercejor.repuestofercejor.model.entity.CbzCompraEntity;
import com.fercejor.repuestofercejor.model.entity.DtllCompraEntity;
import com.fercejor.repuestofercejor.model.service.inteface.ICbzCompraService;
import com.fercejor.repuestofercejor.model.service.inteface.IDtllCompraService;

@Controller
@RequestMapping("/compras")
public class CompraController {
    @Autowired
    private IDtllCompraService dtllCompraService;
    @Autowired
    private ICbzCompraService cbzCompraService;

    @RequestMapping("/")
    public String inicio(Model modelo){
        DtllCompraEntity dtllCompraEntity = new DtllCompraEntity();
        CbzCompraEntity cbzCompraEntity = new CbzCompraEntity();

        modelo.addAttribute("cabezeraCompra", cbzCompraEntity);
        modelo.addAttribute("detalleCompra", dtllCompraEntity);
        return "administrador/compras";
    }

    @RequestMapping("/guardar")
    public String guardar(CbzCompraEntity cbzCompra, DtllCompraEntity dtllCompra){

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
        cbzCompraService.guardarCabezeraCompra(cbzCompra);
        
        //Generar Id de detalle
        List<DtllCompraEntity> ListDtllCompra = dtllCompraService.listarDetalleCompra();
        if(ListDtllCompra.size() == 0){
            String id_dtllCompra = "DTCM0001";
            dtllCompra.setIdDtllCompra(id_dtllCompra);
        }
        else{
            DtllCompraEntity ultimoDtllCompra = ListDtllCompra.get(ListDtllCompra.size()-1);
            String UltimoID = ultimoDtllCompra.getIdDtllCompra();
            int numerito = Integer.parseInt(UltimoID.substring(4));
            numerito++;
            String NuevoID = String.format("DTCM%04d", numerito);
            dtllCompra.setIdDtllCompra(NuevoID);
        }
        dtllCompraService.guardarDetalleCompra(dtllCompra);
        return "redirect:/compras/";
    }
}
