package com.fercejor.repuestofercejor.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fercejor.repuestofercejor.model.dao.IDtllCompraDao;
import com.fercejor.repuestofercejor.model.entity.DtllCompraEntity;
import com.fercejor.repuestofercejor.model.service.inteface.IDtllCompraService;

@Service
public class DtllCompraService implements IDtllCompraService{
    @Autowired
    private IDtllCompraDao dtllCompraDao;

    @Override
    public void guardarDetalleCompra(DtllCompraEntity detalleCompra) {
        dtllCompraDao.save(detalleCompra);
    }

    @Override
    public ArrayList<DtllCompraEntity> listarDetalleCompra() {
        return (ArrayList<DtllCompraEntity>) dtllCompraDao.findAll();
    }
}
