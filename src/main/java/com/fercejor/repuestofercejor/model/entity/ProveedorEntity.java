package com.fercejor.repuestofercejor.model.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "PROVEEDOR")
public class ProveedorEntity {
    @Id
    @Column(name = "ID_PROVEEDOR" , length = 10, nullable = false)
    private String idProveedor;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombreProveedor;

    @Column(name = "DIRECCION", length = 100, nullable = false)
    private String direccionProveedor;

    @Column(name = "TELEFONO", length = 100, nullable = false)
    private String telefonoProveedor;

    @Column(name = "ESTADO", length = 100, nullable = false)
    private String estadoProveedor;

    @Column(name = "CORREO", length = 100, nullable = false)
    private String correoProveedor;

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    public String getEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(String estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }

    public void setCorreoProveedor(String correoProveedor) {
        this.correoProveedor = correoProveedor;
    }

    
}
