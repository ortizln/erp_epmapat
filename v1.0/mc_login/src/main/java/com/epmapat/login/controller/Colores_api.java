package com.epmapat.login.controller;

import com.epmapat.login.model.Colores;
import com.epmapat.login.service.Colores_ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/colores")
@CrossOrigin("*")
public class Colores_api {
    @Autowired
    private Colores_ser coloServicio;

    @GetMapping("/tonos")
    public List<Colores> findTonos() {
        return coloServicio.findTonos();
    }
    @GetMapping
    public List<Colores> findByTono(@Param(value = "codigo") String codigo) {
        if (codigo != null) {
            return coloServicio.findByTono(codigo);
        } else {
            return null;
        }
    }
}
