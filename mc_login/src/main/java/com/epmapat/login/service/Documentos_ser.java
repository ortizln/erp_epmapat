package com.epmapat.login.service;

import com.epmapat.login.model.Documentos;
import com.epmapat.login.repository.Documentos_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Documentos_ser {
    @Autowired
    private Documentos_rep dao;

    public List<Documentos> findByNomdoc(String nomdoc) {
        return dao.findByNomdoc(nomdoc);
    }

    public <S extends Documentos> S save(S entity) {
        return dao.save(entity);
    }

    public List<Documentos> findAll() {
        return dao.findAll();
    }
    public Optional<Documentos> findById(Long id) {
        return dao.findById(id);
    }
    public Boolean deleteById(Long id) {
        if (dao.existsById(id)) {
            dao.deleteById(id);
            return !dao.existsById(id);
        }
        return false;
    }
    public void delete(Documentos entity) {
        dao.delete(entity);
    }
}
