package com.epmapat.erp_epmapat.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epmapat.erp_epmapat.modelo.Rutas;

// @Repository
public interface RutasR extends JpaRepository<Rutas, Long> {

	// @Query(value = "SELECT * FROM rutas where codigo=?1", nativeQuery=true)
	// List<Rutas> findByCodigo(String codigo);

	// Valida Código de la Ruta
	@Query("SELECT COUNT(r) > 0 FROM Rutas r WHERE r.codigo = :codigo")
	boolean valCodigo(@Param("codigo") String codigo);

	
	@Query(value = "SELECT * FROM rutas WHERE estado = true ORDER BY idruta asc", nativeQuery = true)
	List<Rutas> findAllActive();
}
