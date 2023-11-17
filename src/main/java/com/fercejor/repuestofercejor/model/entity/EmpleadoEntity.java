package com.fercejor.repuestofercejor.model.entity;
import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "EMPLEADO")
public class EmpleadoEntity implements Serializable{
    @Id
    @Column(name = "ID_EMPLEADO" , length = 10, nullable = false)
    private String idEmpleado;

    @Column(name = "PRIMER_NOMBRE", length = 20, nullable = false)
    private String primerNombreEmpleado;

    @Column(name = "SEGUNDO_NOMBRE", length = 20, nullable = false)
    private String segundoNombreEmpleado;

    @Column(name = "APELLIDO_PATERNO", length = 20, nullable = false)
    private String apellidoPaternoEmpleado;

    @Column(name = "APELLIDO_MATERNO", length = 20, nullable = false)
    private String apellidoMaternoEmpleado;

    @Column(name = "CORREO", length = 60, nullable = false)
    private String correoEmpleado;

    @Column(name = "DIRECCION", length = 100, nullable = false)
    private String direccionEmpleado;

    @Column(name = "TELEFONO", length = 20, nullable = false)
    private String telefonoEmpleado;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "FECHA_CONTRATO", nullable = false)
    private Date fechaContratoEmpleado;

    @Column(name = "ESTADO", length = 1, nullable = false)
    private String estadoEmpleado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CARGO", nullable = false)
    private CargoEntity cargo;

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPrimerNombreEmpleado() {
        return primerNombreEmpleado;
    }

    public void setPrimerNombreEmpleado(String primerNombreEmpleado) {
        this.primerNombreEmpleado = primerNombreEmpleado;
    }

    public String getSegundoNombreEmpleado() {
        return segundoNombreEmpleado;
    }

    public void setSegundoNombreEmpleado(String segundoNombreEmpleado) {
        this.segundoNombreEmpleado = segundoNombreEmpleado;
    }

    public String getApellidoPaternoEmpleado() {
        return apellidoPaternoEmpleado;
    }

    public void setApellidoPaternoEmpleado(String apellidoPaternoEmpleado) {
        this.apellidoPaternoEmpleado = apellidoPaternoEmpleado;
    }

    public String getApellidoMaternoEmpleado() {
        return apellidoMaternoEmpleado;
    }

    public void setApellidoMaternoEmpleado(String apellidoMaternoEmpleado) {
        this.apellidoMaternoEmpleado = apellidoMaternoEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public Date getFechaContratoEmpleado() {
        return fechaContratoEmpleado;
    }

    public void setFechaContratoEmpleado(Date fechaContratoEmpleado) {
        this.fechaContratoEmpleado = fechaContratoEmpleado;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public CargoEntity getCargo() {
        return cargo;
    }

    public void setCargo(CargoEntity cargo) {
        this.cargo = cargo;
    }

    
}
