package com.fercejor.repuestofercejor.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.fercejor.repuestofercejor.model.dao.IEmpleadoDao;
import com.fercejor.repuestofercejor.model.entity.EmpleadoEntity;
import com.fercejor.repuestofercejor.model.service.inteface.IEmpleadoService;

@Service
public class EmpleadoService implements IEmpleadoService{
    @Autowired
    private IEmpleadoDao empleadoDao;
    @Override
    public void guardarEmpleado(EmpleadoEntity empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    public ArrayList<EmpleadoEntity> listaEmpleado() {
        return (ArrayList<EmpleadoEntity>) empleadoDao.findAll();
    }

    @Override
    public String eliminarEmpleado(String id) {
        String rpta = "";
        try {
            empleadoDao.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            rpta = "No se puede eliminar al empleado porque hay ventas asociados a ella.";
        }
        catch (Exception e) {
            rpta = "Error al eliminar al empleado. \n Detalle :" + e.getMessage() ;
        }
        

        return rpta;
    }
    
}
