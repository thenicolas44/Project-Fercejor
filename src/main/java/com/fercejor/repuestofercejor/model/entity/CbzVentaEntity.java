package com.fercejor.repuestofercejor.model.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "CABECERA_VENTA")
public class CbzVentaEntity {
    @Id
    @Column(name = "ID_CABECERA_VENTA" , length = 10, nullable = false)
    private String idCbzVenta;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "FECHA_PEDIDO", nullable = false)
    private Date fechaCbzVenta;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private ClienteEntity clienteCbzVenta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EMPLEADO", nullable = false)
    private EmpleadoEntity empleadoCbzVenta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUCTO", nullable = false)
    private ProductoEntity productoCbzVenta;

    @Column(name = "CANTIDAD", length = 20 ,nullable = false)
    private Integer cantidadCbzVenta;

    @Column(name = "TOTAL", nullable = false)
    private Double totalCbzVenta;

    public String getIdCbzVenta() {
        return idCbzVenta;
    }

    public void setIdCbzVenta(String idCbzVenta) {
        this.idCbzVenta = idCbzVenta;
    }

    public Date getFechaCbzVenta() {
        return fechaCbzVenta;
    }

    public void setFechaCbzVenta(Date fechaCbzVenta) {
        this.fechaCbzVenta = fechaCbzVenta;
    }


    public EmpleadoEntity getEmpleadoCbzVenta() {
        return empleadoCbzVenta;
    }

    public void setEmpleadoCbzVenta(EmpleadoEntity empleadoCbzVenta) {
        this.empleadoCbzVenta = empleadoCbzVenta;
    }

    public ProductoEntity getProductoCbzVenta() {
        return productoCbzVenta;
    }

    public void setProductoCbzVenta(ProductoEntity productoCbzVenta) {
        this.productoCbzVenta = productoCbzVenta;
    }

    public Integer getCantidadCbzVenta() {
        return cantidadCbzVenta;
    }

    public void setCantidadCbzVenta(Integer cantidadCbzVenta) {
        this.cantidadCbzVenta = cantidadCbzVenta;
    }

    public Double getTotalCbzVenta() {
        return totalCbzVenta;
    }

    public void setTotalCbzVenta(Double totalCbzVenta) {
        this.totalCbzVenta = totalCbzVenta;
    }

    public ClienteEntity getClienteCbzVenta() {
        return clienteCbzVenta;
    }

    public void setClienteCbzVenta(ClienteEntity clienteCbzVenta) {
        this.clienteCbzVenta = clienteCbzVenta;
    }

    
}
