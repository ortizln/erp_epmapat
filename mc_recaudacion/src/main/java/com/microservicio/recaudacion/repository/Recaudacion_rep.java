package com.microservicio.recaudacion.repository;

import com.microservicio.recaudacion.model.Recaudacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Recaudacion_rep extends JpaRepository<Recaudacion, Long>
{
}
