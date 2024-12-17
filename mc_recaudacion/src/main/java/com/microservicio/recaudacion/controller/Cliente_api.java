package com.microservicio.recaudacion.controller;

import java.util.List;
import java.util.Optional;

import com.microservicio.recaudacion.interfaces.Abonado_int;
import com.microservicio.recaudacion.interfaces.Cliente_int;
import com.microservicio.recaudacion.service.Abonado_ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservicio.recaudacion.interfaces.Factura_int;
import com.microservicio.recaudacion.model.Clientes;
import com.microservicio.recaudacion.service.Cliente_ser;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class Cliente_api {
	@Autowired
	private Cliente_ser s_cliente;

	@GetMapping
	public ResponseEntity<Optional<Clientes>> getByIdCliente(@RequestParam Long idcliente) {
		return ResponseEntity.ok(s_cliente.findByIdCliente(idcliente));
	}
	@GetMapping("/datos")
	public ResponseEntity<List<Cliente_int>> clienteDatos(@RequestParam String dato){
		return ResponseEntity.ok(s_cliente.clienteDatos(dato));
	}
}
