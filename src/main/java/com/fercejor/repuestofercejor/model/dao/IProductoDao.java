package com.fercejor.repuestofercejor.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.fercejor.repuestofercejor.model.entity.ProductoEntity;

public interface IProductoDao extends CrudRepository<ProductoEntity,String>{
    
}
