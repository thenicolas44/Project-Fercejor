package com.fercejor.repuestofercejor.model.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTO")
public class ProductoEntity implements Serializable{
    
    @Id
    @Column(name = "ID_PRODUCTO" , length = 10, nullable = false)
    private String idProducto;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombreProducto;

    @Column(name = "DESCRIPCION", length = 100, nullable = false)
    private String descripcionProducto;
    
    @Column(name = "PRECIOCOMPRA", nullable = false)
    private Double precioComProducto;
    
    @Column(name = "PRECIOVENTA", nullable = false)
    private Double precioVenProducto;
    
    @Column(name="STOCK",nullable=false)
    private Integer stockProducto;
    
    @ManyToOne(fetch=FetchType.LAZY,optional=false)
    @JoinColumn(name="ID_CATEGORIA")
    private CategoriaEntity categoria;

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioComProducto() {
        return precioComProducto;
    }

    public void setPrecioComProducto(Double precioComProducto) {
        this.precioComProducto = precioComProducto;
    }

    public Double getPrecioVenProducto() {
        return precioVenProducto;
    }

    public void setPrecioVenProducto(Double precioVenProducto) {
        this.precioVenProducto = precioVenProducto;
    }

    public Integer getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(Integer stockProducto) {
        this.stockProducto = stockProducto;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    
}
