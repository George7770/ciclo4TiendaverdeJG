package com.verde_claro.verde.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verde_claro.verde.Collection.Productos;
import com.verde_claro.verde.IRepository.IProductosRepository;
import com.verde_claro.verde.IService.IProductosService;

@Service
public class ProductosService implements IProductosService {

    @Autowired
    private IProductosRepository repository;

    @Override
    public List<Productos> all(){
        return repository.findAll();
    }

    @Override
    public Optional<Productos> findById(String id){
        return repository.findById(id);
    }

    @Override
    public Productos save(Productos productos){
        return repository.save(productos);
    }

    @Override
    public void delete(String id){
        repository.deleteById(id);
    }

}
