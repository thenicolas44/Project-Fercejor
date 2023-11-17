package com.fercejor.repuestofercejor.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORIA")
public class CategoriaEntity {
    @Id
    @Column(unique = true, name = "ID_CATEGORIA" , length = 10, nullable = false)
    private String idCategoria;

    @Column(name = "NOMBRE", length = 255, nullable = false)
    private String nombreCategoria;

    @Column(name = "DESCRIPCION", length = 255, nullable = false)
    private String descripcionCategoria;

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    
}
