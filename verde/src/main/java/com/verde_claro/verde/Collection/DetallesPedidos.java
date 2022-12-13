package com.verde_claro.verde.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("DetallesPedidos")
public class DetallesPedidos {
    

    @Id
    private String id;

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

    /*    @DBRef
    private Pedidos pedidoId

    @DBRef
    private Productos productoId
*/

}
