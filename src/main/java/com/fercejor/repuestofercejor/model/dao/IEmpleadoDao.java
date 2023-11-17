package com.fercejor.repuestofercejor.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.fercejor.repuestofercejor.model.entity.EmpleadoEntity;

public interface IEmpleadoDao extends CrudRepository<EmpleadoEntity,String>{
    
}
