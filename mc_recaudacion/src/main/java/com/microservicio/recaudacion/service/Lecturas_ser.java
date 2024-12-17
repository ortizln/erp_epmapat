package com.microservicio.recaudacion.service;

import com.microservicio.recaudacion.interfaces.Interes_int;
import com.microservicio.recaudacion.repository.Lecturas_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Lecturas_ser {
    @Autowired
    private Lecturas_rep dao;

    public List<Interes_int> getForIntereses(Long idfactura) {
        return dao.getForIntereses(idfactura);
    }
}
