package com.fercejor.repuestofercejor.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.fercejor.repuestofercejor.model.entity.CargoEntity;

public interface ICargoDao extends CrudRepository<CargoEntity,String>{
    
}
