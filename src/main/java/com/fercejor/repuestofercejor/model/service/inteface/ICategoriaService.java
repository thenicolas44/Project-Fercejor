package com.fercejor.repuestofercejor.model.service.inteface;

import java.util.ArrayList;

import com.fercejor.repuestofercejor.model.entity.CategoriaEntity;

public interface ICategoriaService {
    public void guardarCategoria(CategoriaEntity categoria);
    public ArrayList<CategoriaEntity> listarCategoria();
    public void eliminarCategoria(String id);
}
