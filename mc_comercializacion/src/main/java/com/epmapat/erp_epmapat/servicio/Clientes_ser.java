package com.epmapat.erp_epmapat.servicio;

import com.epmapat.erp_epmapat.DTO.Clientes_dto;
import com.epmapat.erp_epmapat.interfaces.CVClientes;
import com.epmapat.erp_epmapat.modelo.Clientes;
import com.epmapat.erp_epmapat.repositorio.Clientes_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class Clientes_ser {
    @Autowired
    private Clientes_rep dao;

    // Campos: id y nombre
    public List<Map<String, Object>> obtenerCampos() {
        return dao.findAllClientsFields();
    }

    // Buscar Clientes por Nombre o Identificacion
    public List<Clientes> findByNombreIdentifi(String nombreIdentifi) {
        return dao.findByNombreIdentifi(nombreIdentifi);
    }

    // Buscar Clientes por Identificacion
    public List<Clientes> findByIdentificacion(String identificacion) {
        return dao.findByIdentificacion(identificacion);
    }

    // Buscar Clientes por Nombre
    public List<Clientes> findByNombre(String nombre) {
        return dao.findByNombre(nombre);
    }

    // Valida Identificacion
    public boolean valIdentificacion(String nombre) {
        return dao.valIdentificacion(nombre);
    }

    // Valida Nombre
    public boolean valNombre(String nombre) {
        return dao.valNombre(nombre);
    }

    public <S extends Clientes> S save(S entity) {
        return dao.save(entity);
    }

    public Optional<Clientes> findById(Long id) {
        return dao.findById(id);
    }

    public void deleteById(Long id) {
        dao.deleteByIdQ(id);
    }

    public List<Clientes> used(Long id) {
        return dao.used(id);
    }

    public Long totalclientes() {
        return dao.totalClientes();
    }

    public List<CVClientes> getCVByCliente(LocalDate fecha) {
        return dao.getCVByCliente(fecha);
    }

}
