package com.fercejor.repuestofercejor.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fercejor.repuestofercejor.model.dao.IProveedorDao;
import com.fercejor.repuestofercejor.model.entity.ProveedorEntity;
import com.fercejor.repuestofercejor.model.service.inteface.IProveedorService;

@Service
public class ProveedorService implements IProveedorService {
    @Autowired
    private IProveedorDao proveedorDao;

    @Override
    public ArrayList<ProveedorEntity> listaProveedor() {
        return (ArrayList<ProveedorEntity>) proveedorDao.findAll();
    }
}
