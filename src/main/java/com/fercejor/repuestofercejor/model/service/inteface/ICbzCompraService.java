package com.fercejor.repuestofercejor.model.service.inteface;

import java.util.ArrayList;

import com.fercejor.repuestofercejor.model.entity.CbzCompraEntity;

public interface ICbzCompraService {
    public void guardarCabezeraCompra(CbzCompraEntity cabezeraCompra);
    public ArrayList<CbzCompraEntity> listarCabezeraCompra();
}
