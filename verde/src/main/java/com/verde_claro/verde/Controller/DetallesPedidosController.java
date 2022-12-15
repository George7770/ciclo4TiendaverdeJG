package com.verde_claro.verde.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.verde_claro.verde.Collection.DetallesPedidos;
import com.verde_claro.verde.IService.IDetallesPedidosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/detallesPedidos")
public class DetallesPedidosController {
    
    @Autowired
	private IDetallesPedidosService service;
	
	@GetMapping
	public List<DetallesPedidos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<DetallesPedidos> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetallesPedidos save(@RequestBody DetallesPedidos detallesPedidos) {
		return service.save(detallesPedidos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetallesPedidos update(@PathVariable String id, @RequestBody DetallesPedidos detallesPedidos) {
		Optional<DetallesPedidos> op = service.findById(id);
		
		if (!op.isEmpty()) {
			DetallesPedidos PedidosUpdate = op.get();
			PedidosUpdate.setPrecioBrutoVenta(detallesPedidos.getPrecioBrutoVenta());
			PedidosUpdate.setDescuento(detallesPedidos.getDescuento());
            PedidosUpdate.setIva(detallesPedidos.getIva());
			PedidosUpdate.setPrecioNetoVenta(detallesPedidos.getPrecioNetoVenta());
			PedidosUpdate.setEstado(detallesPedidos.getEstado());
			return service.save(PedidosUpdate);
		}
			return detallesPedidos;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
  
}
