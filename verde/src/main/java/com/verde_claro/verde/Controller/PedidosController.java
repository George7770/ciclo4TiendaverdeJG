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

import com.verde_claro.verde.Collection.Pedidos;
import com.verde_claro.verde.IService.IPedidosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/pedidos")
public class PedidosController {
    
    @Autowired
	private IPedidosService service;
	
	@GetMapping
	public List<Pedidos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Pedidos> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pedidos save(@RequestBody Pedidos pedidos) {
		return service.save(pedidos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pedidos update(@PathVariable String id, @RequestBody Pedidos pedidos) {
		Optional<Pedidos> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Pedidos PedidosUpdate = op.get();
			PedidosUpdate.setEstadoPedido(pedidos.getEstadoPedido());
			PedidosUpdate.setFechaPedido(pedidos.getFechaPedido());
			PedidosUpdate.setPrecioBrutoVenta(pedidos.getPrecioBrutoVenta());
			PedidosUpdate.setDescuento(pedidos.getDescuento());
			PedidosUpdate.setIva(pedidos.getIva());
			PedidosUpdate.setPrecioNetoVenta(pedidos.getPrecioNetoVenta());
			PedidosUpdate.setEstado(pedidos.getEstado());
			return service.save(PedidosUpdate);
		}
		
		return pedidos;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}

    
}
