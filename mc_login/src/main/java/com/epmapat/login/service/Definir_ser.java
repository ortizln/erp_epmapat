package com.epmapat.login.service;

import com.epmapat.login.model.Definir;
import com.epmapat.login.repository.Definir_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Definir_ser {
    @Autowired
    private Definir_rep dao;

    public Optional<Definir> findById(Long id) {
        return dao.findById(id);
    }

    public <S extends Definir> S save(S entity) {
        return dao.save(entity);
    }
}
