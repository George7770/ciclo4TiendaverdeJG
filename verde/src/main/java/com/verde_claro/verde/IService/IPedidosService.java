package com.verde_claro.verde.IService;

import java.util.List;
import java.util.Optional;

import com.verde_claro.verde.Collection.Pedidos;

public interface IPedidosService {
    
    public List<Pedidos> all();

    public Optional<Pedidos> findById(String id);

    public Pedidos save(Pedidos pedidos);

    public void delete(String id);
   
    
}
