package com.fercejor.repuestofercejor.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fercejor.repuestofercejor.model.dao.IClienteDao;
import com.fercejor.repuestofercejor.model.entity.ClienteEntity;
import com.fercejor.repuestofercejor.model.service.inteface.IClienteService;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    private IClienteDao clienteDao;

    @Override
    public void guardarCliente(ClienteEntity cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public ArrayList<ClienteEntity> listarCliente() {
        return (ArrayList<ClienteEntity>) clienteDao.findAll();
    }

    @Override
    public void eliminarCliente(String idCliente) {
        clienteDao.deleteById(idCliente);
    }
}
