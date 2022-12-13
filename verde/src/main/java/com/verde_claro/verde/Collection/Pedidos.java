package com.verde_claro.verde.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Pedidos")
public class Pedidos {
    



    @Id
    private String id;

    @Field("estadoPedido")
    private String estadoPedido;

    @Field("fechaPedido")
    private String fechaPedido;

    @Field("precioBrutoVenta")
    private String precioBrutoVenta;

    @Field("descuento")
    private String descuento;

    @Field("iva")
    private String iva;

    @Field("precioNetoVenta")
    private String precioNetoVenta;

    @Field("estado")
    private String estado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getPrecioBrutoVenta() {
        return precioBrutoVenta;
    }

    public void setPrecioBrutoVenta(String precioBrutoVenta) {
        this.precioBrutoVenta = precioBrutoVenta;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getPrecioNetoVenta() {
        return precioNetoVenta;
    }

    public void setPrecioNetoVenta(String precioNetoVenta) {
        this.precioNetoVenta = precioNetoVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    /*@DBRef
    private Usuarios usuarioId
*/

}
