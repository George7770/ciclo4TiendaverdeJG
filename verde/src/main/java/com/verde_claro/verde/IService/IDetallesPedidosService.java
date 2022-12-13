package com.verde_claro.verde.IService;

import java.util.List;
import java.util.Optional;

import com.verde_claro.verde.Collection.DetallesPedidos;

public interface IDetallesPedidosService {
    
    public List<DetallesPedidos> all();

    public Optional<DetallesPedidos> findById(String id);

    public DetallesPedidos save(DetallesPedidos detallesPedidos);

    public void delete(String id);
    
}
