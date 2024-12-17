package com.microservicio.recaudacion.repository;

import com.microservicio.recaudacion.model.Impuestos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Impuestos_rep extends JpaRepository<Impuestos, Long> {
@Query(value = "select * from impuestos where estado = ?1", nativeQuery = true)
    Impuestos getImpuestoByEstado(Boolean estado);
}
