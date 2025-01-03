package com.epmapat.login.service;

import com.epmapat.login.model.Ventanas;
import com.epmapat.login.repository.Ventanas_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Ventanas_ser {
    @Autowired
    private Ventanas_rep dao;

    public Ventanas findVentana(Long idusuario, String nombre) {
        return dao.findByIdusuarioAndNombre(idusuario, nombre);
    }

    public <S extends Ventanas> S save(S x) {
        return dao.save( x );
    }

    public Optional<Ventanas> findById(Long id) {
        return dao.findById(id);
    }

}
