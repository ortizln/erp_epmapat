package com.epmapat.erp_epmapat.repositorio;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epmapat.erp_epmapat.modelo.TramiteNuevo;

public interface TramiteNuevoR extends JpaRepository<TramiteNuevo, Long>{

	@Query(value = "SELECT * FORM tramitenuevo LIMIT 10", nativeQuery=true)
	List<TramiteNuevo> findAll();

	@Query(value = "select * from tramitenuevo t inner join aguatramite a on t.idaguatramite_aguatramite = a.idaguatramite where  t.idaguatramite_aguatramite = ?1", nativeQuery= true)
	public List<TramiteNuevo> findByIdAguaTramite(Long idaguatramite);

}
