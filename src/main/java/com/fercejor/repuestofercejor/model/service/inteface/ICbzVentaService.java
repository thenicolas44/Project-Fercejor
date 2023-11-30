package com.fercejor.repuestofercejor.model.service.inteface;

import java.util.ArrayList;

import com.fercejor.repuestofercejor.model.entity.CbzVentaEntity;

public interface ICbzVentaService {
    public void guardarCabezeraVenta(CbzVentaEntity cabecerVenta);
    public ArrayList<CbzVentaEntity> listarCabecerVenta();
    public CbzVentaEntity ventaEncontrar(String id);
}

