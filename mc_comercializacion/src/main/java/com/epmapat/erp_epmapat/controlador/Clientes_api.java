package com.epmapat.erp_epmapat.controlador;

import com.epmapat.erp_epmapat.modelo.Clientes;
import com.epmapat.erp_epmapat.servicio.Clientes_ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class Clientes_api {
    @Autowired
    private Clientes_ser s_clietnes; 
    
    @GetMapping
    ResponseEntity<List<Long>> getAll(){
        return ResponseEntity.ok(s_clietnes.findAll());
    }
}
