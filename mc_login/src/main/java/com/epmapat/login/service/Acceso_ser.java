package com.epmapat.login.service;

import com.epmapat.login.model.Acceso;
import com.epmapat.login.repository.Acceso_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Acceso_ser {
    @Autowired
    private Acceso_rep dao;
    // Todos
    public List<Acceso> findAll() {
        return dao.findAll();
    }
}
