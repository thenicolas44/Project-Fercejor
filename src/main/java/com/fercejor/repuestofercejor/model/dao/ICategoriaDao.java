package com.fercejor.repuestofercejor.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.fercejor.repuestofercejor.model.entity.CategoriaEntity;

public interface ICategoriaDao extends CrudRepository<CategoriaEntity,String>{
    
}
