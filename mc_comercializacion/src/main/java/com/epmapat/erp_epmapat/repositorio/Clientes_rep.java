package com.epmapat.erp_epmapat.repositorio;

import com.epmapat.erp_epmapat.DTO.Clientes_dto;
import com.epmapat.erp_epmapat.modelo.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes_rep extends JpaRepository<Clientes, Long> {
}
