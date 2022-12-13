package com.verde_claro.verde.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.verde_claro.verde.Collection.Productos;

public interface IProductosRepository extends MongoRepository<Productos, String>{
    
}
