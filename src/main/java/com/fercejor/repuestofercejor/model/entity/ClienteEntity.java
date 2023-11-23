package com.fercejor.repuestofercejor.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class ClienteEntity {
    @Id
    @Column(name = "ID_CLIENTE" , length = 10, nullable = false)
    private String idCliente;

    @Column(name = "NOMBRE", length = 20, nullable = false)
    private String nombreCliente;

    @Column(name = "APELLIDO", length = 20, nullable = false)
    private String apellidoCliente;

    @Column(name = "DIRECCION", length = 60, nullable = false)
    private String direccionCliente;

    @Column(name = "TELEFONO", length = 60, nullable = false)
    private String telefonoCliente;


    @Column(name = "PAIS", length = 60, nullable = false)
    private String paisCliente;


    public String getIdCliente() {
        return idCliente;
    }


    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }


    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }


    public String getApellidoCliente() {
        return apellidoCliente;
    }


    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }


    public String getDireccionCliente() {
        return direccionCliente;
    }


    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }


    public String getTelefonoCliente() {
        return telefonoCliente;
    }


    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }


    public String getPaisCliente() {
        return paisCliente;
    }


    public void setPaisCliente(String paisCliente) {
        this.paisCliente = paisCliente;
    }


    
}
