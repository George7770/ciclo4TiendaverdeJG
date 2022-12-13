package com.verde_claro.verde.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verde_claro.verde.Collection.Pedidos;
import com.verde_claro.verde.IRepository.IPedidosRepository;
import com.verde_claro.verde.IService.IPedidosService;

@Service
public class PedidosService implements IPedidosService {

    @Autowired
    private IPedidosRepository repository;

    @Override
    public List<Pedidos> all(){
        return repository.findAll();
    }

    @Override
    public Optional<Pedidos> findById(String id){
        return repository.findById(id);
    }

    @Override
    public Pedidos save(Pedidos pedidos){
        return repository.save(pedidos);
    }

    @Override
    public void delete(String id){
        repository.deleteById(id);
    }

}
