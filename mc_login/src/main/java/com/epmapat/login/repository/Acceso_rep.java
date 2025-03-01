package com.epmapat.login.repository;

import com.epmapat.login.model.Acceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Acceso_rep extends JpaRepository<Acceso, Long> {
    @Query(value = "SELECT * FROM acceso order by codacc", nativeQuery = true)
    List<Acceso> findAll();
}
