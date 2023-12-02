package com.fercejor.repuestofercejor.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.fercejor.repuestofercejor.model.dao.IProductoDao;
import com.fercejor.repuestofercejor.model.entity.ProductoEntity;
import com.fercejor.repuestofercejor.model.service.inteface.IProductoService;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private IProductoDao productoDao;

    @Override
    public void guardarProducto(ProductoEntity producto) {
        productoDao.save(producto);
    }

    @Override
    public ArrayList<ProductoEntity> listaProductos() {
        return (ArrayList<ProductoEntity>) productoDao.findAll();
    }

    @Override
    public String eliminarProducto(String id) {
        String rpta = "";
        
        try {
            productoDao.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            rpta = "No se puede eliminar el producto porque hay productos asociados a ella.";
        }
        catch(Exception e){
            rpta = "Error al eliminar el producto. \n Detalle :" + e.getMessage() ;
        }
        return rpta;
    }
    
}
