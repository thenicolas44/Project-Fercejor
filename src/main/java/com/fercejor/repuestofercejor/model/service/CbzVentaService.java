package com.fercejor.repuestofercejor.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fercejor.repuestofercejor.model.dao.ICbzVentaDao;
import com.fercejor.repuestofercejor.model.entity.CbzVentaEntity;
import com.fercejor.repuestofercejor.model.service.inteface.ICbzVentaService;
@Service
public class CbzVentaService implements ICbzVentaService{
    @Autowired
    private ICbzVentaDao cbzVentaDao;

    @Override
    public void guardarCabezeraVenta(CbzVentaEntity cabecerVenta) {
        cbzVentaDao.save(cabecerVenta);
    }

    @Override
    public ArrayList<CbzVentaEntity> listarCabecerVenta() {
        return(ArrayList<CbzVentaEntity>) cbzVentaDao.findAll();
    }

    @Override
    public CbzVentaEntity ventaEncontrar(String id) {
        return cbzVentaDao.findById(id).orElse(null);
    }

    
} 
    
