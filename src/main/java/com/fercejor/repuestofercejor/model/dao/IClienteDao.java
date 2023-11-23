package com.fercejor.repuestofercejor.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.fercejor.repuestofercejor.model.entity.ClienteEntity;

public interface IClienteDao extends CrudRepository<ClienteEntity,String>{
    
}
