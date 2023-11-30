package com.fercejor.repuestofercejor.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fercejor.repuestofercejor.model.dao.ICbzCompraDao;
import com.fercejor.repuestofercejor.model.entity.CbzCompraEntity;
import com.fercejor.repuestofercejor.model.service.inteface.ICbzCompraService;

@Service
public class CbzCompraService implements ICbzCompraService{
    @Autowired
    private ICbzCompraDao cbzCompraDao;
    @Override
    public void guardarCabezeraCompra(CbzCompraEntity cabezeraCompra) {
        cbzCompraDao.save(cabezeraCompra);
    }

    @Override
    public ArrayList<CbzCompraEntity> listarCabezeraCompra() {
        return (ArrayList<CbzCompraEntity>) cbzCompraDao.findAll();
    }

    @Override
    public CbzCompraEntity compra(String id) {
        return cbzCompraDao.findById(id).orElse(null);
    }
    
}
