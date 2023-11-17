package com.fercejor.repuestofercejor.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.fercejor.repuestofercejor.model.entity.ProveedorEntity;

public interface IProveedorDao extends CrudRepository<ProveedorEntity,String>{
    
}
