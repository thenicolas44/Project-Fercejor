package com.fercejor.repuestofercejor.model.service.inteface;

import java.util.ArrayList;

import com.fercejor.repuestofercejor.model.entity.DtllCompraEntity;

public interface IDtllCompraService {
    public void guardarDetalleCompra(DtllCompraEntity detalleCompra);
    public ArrayList<DtllCompraEntity> listarDetalleCompra();
}
