package com.fercejor.repuestofercejor.model.service.inteface;

import java.util.ArrayList;

import com.fercejor.repuestofercejor.model.entity.ProductoEntity;

public interface IProductoService {
    public void guardarProducto(ProductoEntity producto);
    public ArrayList<ProductoEntity> listaProductos();
    public String eliminarProducto(String id);
}
