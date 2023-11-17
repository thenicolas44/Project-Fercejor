package com.fercejor.repuestofercejor.model.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "DETALLE_COMPRA")
@IdClass(DtllCompraEntity.class)
public class DtllCompraEntity implements Serializable{
    @Id
    @Column(name = "ID_DETALLE_COMPRA" , length = 10, nullable = false)
    private String idDtllCompra;

    @Id // Clave foránea y parte de la clave primaria
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUCTO", nullable = false)
    private ProductoEntity productoDtllCompra;

    @Column(name = "CANTIDAD", length = 20, nullable = false)
    private Integer cantidadDtllCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CABECERA_COMPRA", nullable = false)
    private CbzCompraEntity cbzCompra;

    

    public String getIdDtllCompra() {
        return idDtllCompra;
    }

    public void setIdDtllCompra(String idDtllCompra) {
        this.idDtllCompra = idDtllCompra;
    }

    public ProductoEntity getProductoDtllCompra() {
        return productoDtllCompra;
    }

    public void setProductoDtllCompra(ProductoEntity productoDtllCompra) {
        this.productoDtllCompra = productoDtllCompra;
    }

    public Integer getCantidadDtllCompra() {
        return cantidadDtllCompra;
    }

    public void setCantidadDtllCompra(Integer cantidadDtllCompra) {
        this.cantidadDtllCompra = cantidadDtllCompra;
    }

    public CbzCompraEntity getCbzCompra() {
        return cbzCompra;
    }

    public void setCbzCompra(CbzCompraEntity cbzCompra) {
        this.cbzCompra = cbzCompra;
    }

    @Override
    public boolean equals(Object o ){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DtllCompraEntity that = (DtllCompraEntity) o;
        return  Objects.equals(idDtllCompra, that.idDtllCompra) &&
                Objects.equals(productoDtllCompra, that.productoDtllCompra) &&
                Objects.equals(cantidadDtllCompra, that.cantidadDtllCompra) &&
                Objects.equals(cbzCompra, that.cbzCompra);
    }

    @Override
    public int hashCode(){
        return Objects.hash(idDtllCompra,productoDtllCompra,cantidadDtllCompra,cbzCompra);
    }
}
