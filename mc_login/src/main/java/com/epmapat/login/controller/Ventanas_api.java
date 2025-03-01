package com.epmapat.login.controller;

import com.epmapat.login.model.Ventanas;
import com.epmapat.login.service.Ventanas_ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ventanas")
@CrossOrigin("*")
public class Ventanas_api {
    @Autowired
    private Ventanas_ser venServicio;

    @GetMapping
    public Ventanas getAllLista(@Param(value = "idusuario") Long idusuario,
                                @Param(value = "nombre") String nombre) {
        if (idusuario != null && nombre != null) {
            return venServicio.findVentana(idusuario, nombre);
        } else {
            return null;
        }
    }

    @PostMapping
    public ResponseEntity<Ventanas> save(@RequestBody Ventanas x) {
        return ResponseEntity.ok(venServicio.save(x));
    }

    @PutMapping("/{idventana}")
    public ResponseEntity<Ventanas> update(@PathVariable Long idventana, @RequestBody Ventanas x) {
        Ventanas y = venServicio.findById(idventana).orElseThrow();
        y.setNombre(x.getNombre());
        y.setColor1(x.getColor1());
        y.setColor2(x.getColor2());
        y.setIdusuario(x.getIdusuario());
        Ventanas actualizar = venServicio.save(y);
        return ResponseEntity.ok(actualizar);
    }

}
