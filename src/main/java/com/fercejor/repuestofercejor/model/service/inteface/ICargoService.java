package com.fercejor.repuestofercejor.model.service.inteface;

import java.util.ArrayList;

import com.fercejor.repuestofercejor.model.entity.CargoEntity;

public interface ICargoService {
    public void guardarCargo(CargoEntity cargo);
    public ArrayList<CargoEntity> listaCargo();
    public String eliminarCargo(String id);
}
