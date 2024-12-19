package com.epmapat.erp_epmapat.modelo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="clientes")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcliente;
	private String cedula;
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtpidentifica_tpidentifica")
	private Tpidentifica idtpidentifica_tpidentifica;
	private String nombre;
    // public String getNombe() {
    // 	return nombre;
    // }
    // public void setNombe(String nombe) {
    // 	this.nombre = nombe;
    // }
    private String direccion;
	private String telefono;
	private LocalDate fechanacimiento;
	private Long discapacitado;
	private Long porcdiscapacidad;
	private Long porcexonera;
	private Long estado;
	private String email;
	private Long usucrea;
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="idnacionalidad_nacionalidad")
	private Nacionalidad idnacionalidad_nacionalidad;
	/* @Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name ="feccrea") */
	private LocalDate feccrea;
	private Long usumodi;
/* 	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name ="fecmodi") */
	private LocalDate fecmodi;
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="idpjuridica_personeriajuridica")
	private PersonJuridica idpjuridica_personeriajuridica;

}
