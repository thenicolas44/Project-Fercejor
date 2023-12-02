package com.fercejor.repuestofercejor.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.fercejor.repuestofercejor.model.dao.ICargoDao;
import com.fercejor.repuestofercejor.model.entity.CargoEntity;
import com.fercejor.repuestofercejor.model.service.inteface.ICargoService;

@Service
public class CargoService implements ICargoService{
    @Autowired
    private ICargoDao cargoDao;
    @Override
    public void guardarCargo(CargoEntity cargo) {
        cargoDao.save(cargo);
    }

    @Override
    public ArrayList<CargoEntity> listaCargo() {
        return (ArrayList<CargoEntity>) cargoDao.findAll();
    }

    @Override
    public String eliminarCargo(String id) {
        String rpta = "";
        try {
            cargoDao.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            rpta = "No se puede eliminar el cargo porque hay empleados asociados a ella.";
        }catch(Exception e){
            rpta = "Error al eliminar el cargo. \n Detalle :" + e.getMessage() ;
        }
        return rpta;
        
    }
    
}
