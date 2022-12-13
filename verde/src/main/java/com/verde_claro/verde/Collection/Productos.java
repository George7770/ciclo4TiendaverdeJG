package com.verde_claro.verde.Collection;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document("Productos")
public class Productos {
    
    @Id
    private String id;

    @Field("codigo")
    private String codigo;

    @Field("nombre")
    private String nombre;

    @Field("descripcion")
    private String descripcion;

    @Field("imagen")
    private String imagen;

    @Field("cantidadMaxima")
    private String cantidadMaxima;

    @Field("cantidadMinima")
    private String cantidadMinima;

    @Field("stock")
    private String stock;

    @Field("precioUnitarioCompra")
    private String precioUnitarioCompra;

    @Field("iva")
    private String iva;

    @Field("descuento")
    private String descuento;

    @Field("estado")
    private String estado;
/*
    @DBRef
    private Categorias categoriaId

    @DBRef
    private Marcas marcasId

    @DBRef
    private UnidadesMedidas unidadMedidaId
*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(String cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public String getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(String cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrecioUnitarioCompra() {
        return precioUnitarioCompra;
    }

    public void setPrecioUnitarioCompra(String precioUnitarioCompra) {
        this.precioUnitarioCompra = precioUnitarioCompra;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
