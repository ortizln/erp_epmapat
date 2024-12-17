package com.microservicio.recaudacion.controller;

import com.microservicio.recaudacion.service.Impuestos_ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/impuestos")
@CrossOrigin("*")
public class Impuestos_api {
    @Autowired
    private Impuestos_ser s_impuetos;
    @GetMapping
    ResponseEntity<BigDecimal> findImpuesto(@RequestParam Long idfactura){
        return ResponseEntity.ok(s_impuetos.calcularIva(idfactura));
    }
}
