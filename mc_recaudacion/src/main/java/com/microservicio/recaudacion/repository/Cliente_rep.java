package com.microservicio.recaudacion.repository;

import com.microservicio.recaudacion.interfaces.Cliente_int;
import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.recaudacion.model.Clientes;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Cliente_rep extends JpaRepository<Clientes,Long> {

    @Query(value = "select c.idcliente, c.nombre, c.cedula from clientes c where c.nombre like %?1% or c.cedula like %?1% order by c.idcliente desc", nativeQuery = true)
    List<Cliente_int> clienteDatos(String dato);
}
