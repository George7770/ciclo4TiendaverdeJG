package com.verde_claro.verde.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verde_claro.verde.Collection.DetallesPedidos;
import com.verde_claro.verde.IRepository.IDetallesPedidosRepository;
import com.verde_claro.verde.IService.IDetallesPedidosService;

@Service
public class DetallesPedidosService implements IDetallesPedidosService {

    @Autowired
    private IDetallesPedidosRepository repository;

    @Override
    public List<DetallesPedidos> all(){
        return repository.findAll();
    }

    @Override
    public Optional<DetallesPedidos> findById(String id){
        return repository.findById(id);
    }

    @Override
    public DetallesPedidos save(DetallesPedidos detallesPedidos){
        return repository.save(detallesPedidos);
    }

    @Override
    public void delete(String id){
        repository.deleteById(id);
    }
   
}
