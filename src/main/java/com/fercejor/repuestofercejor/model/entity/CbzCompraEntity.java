package com.fercejor.repuestofercejor.model.entity;
import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "CABECERA_COMPRA")
public class CbzCompraEntity implements Serializable{
    @Id
    @Column(name = "ID_CABECERA_COMPRA" , length = 10, nullable = false)
    private String idCbzCompra;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "FECHA_PEDIDO", nullable = false)
    private Date fechaCbzCompra;

    @Column(name = "CANTIDAD", length = 20, nullable = false)
    private Integer cantidadCbzCompra;

    @Column(name = "PRECIOCOMPRA", nullable = false)
    private Double precioCbzCompra;

    @Column(name = "TOTAL", nullable = false)
    private Double totalCbzCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROVEEDOR", nullable = false)
    private ProveedorEntity proveedorCbzCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUCTO", nullable = false)
    private ProductoEntity productoCbzCompra;

    public String getIdCbzCompra() {
        return idCbzCompra;
    }

    public void setIdCbzCompra(String idCbzCompra) {
        this.idCbzCompra = idCbzCompra;
    }

    public Date getFechaCbzCompra() {
        return fechaCbzCompra;
    }

    public void setFechaCbzCompra(Date fechaCbzCompra) {
        this.fechaCbzCompra = fechaCbzCompra;
    }

    public Integer getCantidadCbzCompra() {
        return cantidadCbzCompra;
    }

    public void setCantidadCbzCompra(Integer cantidadCbzCompra) {
        this.cantidadCbzCompra = cantidadCbzCompra;
    }

    public Double getPrecioCbzCompra() {
        return precioCbzCompra;
    }

    public void setPrecioCbzCompra(Double precioCbzCompra) {
        this.precioCbzCompra = precioCbzCompra;
    }

    public Double getTotalCbzCompra() {
        return totalCbzCompra;
    }

    public void setTotalCbzCompra(Double totalCbzCompra) {
        this.totalCbzCompra = totalCbzCompra;
    }

    public ProveedorEntity getProveedorCbzCompra() {
        return proveedorCbzCompra;
    }

    public void setProveedorCbzCompra(ProveedorEntity proveedorCbzCompra) {
        this.proveedorCbzCompra = proveedorCbzCompra;
    }

    public ProductoEntity getProductoCbzCompra() {
        return productoCbzCompra;
    }

    public void setProductoCbzCompra(ProductoEntity productoCbzCompra) {
        this.productoCbzCompra = productoCbzCompra;
    }

    
}
