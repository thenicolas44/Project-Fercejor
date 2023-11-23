package com.fercejor.repuestofercejor.model.service.inteface;

import java.util.ArrayList;

import com.fercejor.repuestofercejor.model.entity.ClienteEntity;

public interface IClienteService {
    public void guardarCliente(ClienteEntity cliente);
    public ArrayList<ClienteEntity> listarCliente();
    public void eliminarCliente(String idCliente);
}
