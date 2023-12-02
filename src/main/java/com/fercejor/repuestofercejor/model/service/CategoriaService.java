package com.fercejor.repuestofercejor.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.fercejor.repuestofercejor.model.dao.ICategoriaDao;
import com.fercejor.repuestofercejor.model.entity.CategoriaEntity;
import com.fercejor.repuestofercejor.model.service.inteface.ICategoriaService;

@Service
public class CategoriaService implements ICategoriaService{
    @Autowired
    private ICategoriaDao categoriaDao;
    @Override
    public void guardarCategoria(CategoriaEntity categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    public ArrayList<CategoriaEntity> listarCategoria() {
        return (ArrayList<CategoriaEntity>) categoriaDao.findAll();
    }

    @Override
    public String eliminarCategoria(String id) {
        String rpta = "";
        
        try {
            categoriaDao.deleteById(id);
        }catch(DataIntegrityViolationException e){
            rpta = "No se puede eliminar la categoría porque hay productos asociados a ella.";
        } 
        catch (Exception e) {
            rpta = "Error al eliminar la categoría. \n Detalle :" + e.getMessage() ;
        }
        return rpta;
    }
    
}
