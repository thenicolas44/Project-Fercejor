package com.fercejor.repuestofercejor.model.service.inteface;

import java.util.ArrayList;

import com.fercejor.repuestofercejor.model.entity.EmpleadoEntity;

public interface IEmpleadoService {
    public void guardarEmpleado(EmpleadoEntity empleado);
    public ArrayList<EmpleadoEntity> listaEmpleado();
    public void eliminarEmpleado(String id);
}
