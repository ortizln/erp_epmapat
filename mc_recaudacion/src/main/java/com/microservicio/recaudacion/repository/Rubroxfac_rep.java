package com.microservicio.recaudacion.repository;

import com.microservicio.recaudacion.interfaces.Rubroxfaciva_int;
import com.microservicio.recaudacion.model.Rubroxfac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Rubroxfac_rep extends JpaRepository<Rubroxfac, Long> {
    @Query(value = "select rf.cantidad , rf.valorunitario, r.swiva as iva from rubroxfac rf join rubros r on rf.idrubro_rubros = r.idrubro where rf.idfactura_facturas = ?1", nativeQuery = true)
    List<Rubroxfaciva_int> getRubrosByIdFactura(Long idfactura);
}
