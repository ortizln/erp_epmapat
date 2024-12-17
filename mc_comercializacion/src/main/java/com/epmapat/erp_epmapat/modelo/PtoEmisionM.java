package com.epmapat.erp_epmapat.modelo;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ptoemision")
public class PtoEmisionM {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idptoemision;
	private String establecimiento;
	private String direccion;
	private Long estado;
	private String telefono;
	private String nroautorizacion;
	private Long usucrea;	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name = "feccrea")
	private Date feccrea;

}
