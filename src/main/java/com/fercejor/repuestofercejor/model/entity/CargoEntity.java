package com.fercejor.repuestofercejor.model.entity;
import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "CARGO")
public class CargoEntity implements Serializable{
    @Id
    @Column(name = "ID_CARGO" , length = 10, nullable = false)
    private String idCargo;

    @Column(name = "NOMBRE", length = 20, nullable = false)
    private String nombreCargo;

    @Column(name = "DESCRIPCION", length = 20, nullable = false)
    private String descripcionCargo;

    public String getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(String idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public String getDescripcionCargo() {
        return descripcionCargo;
    }

    public void setDescripcionCargo(String descripcionCargo) {
        this.descripcionCargo = descripcionCargo;
    }

    
}
