package com.epmapat.erp_epmapat.modelo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "abonados")
public class Abonados {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idabonado;
	private String nromedidor;
	private Long lecturainicial;
	private Long estado;
	private LocalDate fechainstalacion;
	private String marca;
	private Long secuencia;
	private String direccionubicacion;
	private String localizacion;
	private String observacion;
	private String departamento;
	private String piso;
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idresponsable")
	private Clientes idresponsable;
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcategoria_categorias")
	private Categorias idcategoria_categorias;
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idruta_rutas")
	private Rutas idruta_rutas;
	@JsonManagedReference
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcliente_clientes")
	private Clientes idcliente_clientes;
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "idubicacionm_ubicacionm")
	private Ubicacionm idubicacionm_ubicacionm;
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "idtipopago_tipopago")
	private Tipopago idtipopago_tipopago;
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name = "idestadom_estadom")
	private Estadom idestadom_estadom;
	private Long medidorprincipal;
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "servxabo", joinColumns = @JoinColumn(name =
	 * "idabonado_abonados"), inverseJoinColumns = @JoinColumn(name =
	 * "idservicio_servicios"))
	 * Set<ServiciosM> servSeleccionados = new HashSet<>();
	 */
	private Long usucrea;
	private LocalDate feccrea;
	private Long usumodi;
	private LocalDate fecmodi;
	private Boolean adultomayor;
	private Boolean municipio;
	private Boolean swalcantarillado;
	private Long promedio;


}
