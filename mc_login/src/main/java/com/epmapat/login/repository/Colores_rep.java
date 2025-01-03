package com.epmapat.login.repository;

import com.epmapat.login.model.Colores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Colores_rep extends JpaRepository<Colores, Long> {
    @Query(value = "SELECT * FROM colores where LENGTH(codigo) = 2 order by idcolor", nativeQuery=true)
    List<Colores> findTonos();

    @Query(value = "SELECT * FROM colores where codigo like ?1% and LENGTH(codigo) = 4 order by idcolor", nativeQuery=true)
    List<Colores> findByTono(String codigo);
}
