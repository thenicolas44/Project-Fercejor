package com.fercejor.repuestofercejor.model.entity;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "CABECERA_COMPRA")
public class CbzCompraEntity {
    @Id
    @Column(name = "ID_CABECERA_COMPRA" , length = 10, nullable = false)
    private String idCbzCompra;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "FECHA_PEDIDO", nullable = false)
    private Date fechaCbzCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROVEEDOR", nullable = false)
    private ProveedorEntity proveedor;

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

    public ProveedorEntity getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorEntity proveedor) {
        this.proveedor = proveedor;
    }

    
}
