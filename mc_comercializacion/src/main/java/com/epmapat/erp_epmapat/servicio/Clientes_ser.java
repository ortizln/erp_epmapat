package com.epmapat.erp_epmapat.servicio;

import com.epmapat.erp_epmapat.DTO.Clientes_dto;
import com.epmapat.erp_epmapat.modelo.Clientes;
import com.epmapat.erp_epmapat.repositorio.Clientes_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Clientes_ser {
    @Autowired
    private Clientes_rep dao;

    public List<Clientes> findAll(){
        return dao.findAll();
    }

}
