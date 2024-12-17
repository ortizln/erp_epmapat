package com.microservicio.recaudacion.service;

import java.util.List;
import java.util.Optional;

import com.microservicio.recaudacion.interfaces.Cliente_int;
import com.microservicio.recaudacion.model.Factura_interes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.microservicio.recaudacion.interfaces.Factura_int;
import com.microservicio.recaudacion.model.Clientes;
import com.microservicio.recaudacion.repository.Cliente_rep;
import com.microservicio.recaudacion.repository.Facturas_rep;

@Service
public class Cliente_ser{
    @Autowired
    private Facturas_rep f_dao;
    @Autowired
    private Cliente_rep c_dao;
    @Autowired
    private Abonado_ser a_dao;

    public List<Clientes> findAll() {
        return c_dao.findAll();
    }
    public Optional<Clientes> findByIdCliente(Long idcliente){
    	return c_dao.findById(idcliente);
    }

    public List<Cliente_int> clienteDatos(String dato){
        return c_dao.clienteDatos(dato) ;
    }

    public List<Factura_interes> getFacturasByIdCliente(Long idcliente) {
        List<Factura_int> facturas = f_dao.findSinCobrar(idcliente);
        return a_dao.addInteresToFactura(facturas);
    }

}
