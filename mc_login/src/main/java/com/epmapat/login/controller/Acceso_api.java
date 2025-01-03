package com.epmapat.login.controller;

import com.epmapat.login.model.Acceso;
import com.epmapat.login.service.Acceso_ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/acceso")
@CrossOrigin("*")
public class Acceso_api {
    @Autowired
    private Acceso_ser accServicio;

    @GetMapping
    public List<Acceso> getAll() {
        return accServicio.findAll();
    }
}
