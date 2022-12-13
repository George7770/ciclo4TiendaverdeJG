package com.verde_claro.verde.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.verde_claro.verde.Collection.DetallesPedidos;

public interface IDetallesPedidosRepository extends MongoRepository<DetallesPedidos, String>  {
    
}
