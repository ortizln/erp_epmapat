package com.epmapat.login.service;

import com.epmapat.login.model.Tabla4;
import com.epmapat.login.repository.Tabla4_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Tabla4_ser {
    @Autowired
    private Tabla4_rep dao;

    public List<Tabla4> findAll() {
        return dao.findAll();
    }
    //Validar Comprobantes por código
    public List<Tabla4> findByTipocomprobante(String nomcomprobante) {
        return dao.findByTipocomprobante(nomcomprobante);
    }
    //Validar Comprobantes por Nombre
    public List<Tabla4> findByNomcomprobante(String nomcomprobante) {
        return dao.findByNomcomprobante(nomcomprobante);
    }
    public <S extends Tabla4> S save(S entity) {
        return dao.save(entity);
    }
    public Optional<Tabla4> findById(Long id) {
        return dao.findById(id);
    }
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    public void delete(Tabla4 entity) {
        dao.delete(entity);
    }
}
