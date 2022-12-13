package com.verde_claro.verde.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.verde_claro.verde.Collection.Pedidos;

public interface IPedidosRepository extends MongoRepository<Pedidos, String> {
    
}
