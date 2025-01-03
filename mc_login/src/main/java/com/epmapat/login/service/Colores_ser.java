package com.epmapat.login.service;

import com.epmapat.login.model.Colores;
import com.epmapat.login.repository.Colores_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Colores_ser {
    @Autowired
    private Colores_rep dao;
    public List<Colores> findTonos() {
        return dao.findTonos();
    }
    public List<Colores> findByTono(String codigo) {
        return dao.findByTono(codigo);
    }

}
