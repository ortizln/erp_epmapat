package com.epmapat.erp_epmapat.modelo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
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

	public Clientes(Long idcliente, String cedula,Tpidentifica idtpidentifica_tpidentifica, String nombre, String direccion, String telefono, LocalDate fechanacimiento,
			Long discapacitado, Long porcexonera,Long porcdiscapacidad, Long estado, String email, Long usucrea,
			Nacionalidad idnacionalidad_nacionalidad, LocalDate feccrea, Long usumodi, LocalDate fecmodi,
			PersonJuridica idpjuridica_personeriajuridica) {
		super();
		this.idcliente = idcliente;
		this.cedula = cedula;
		this.idtpidentifica_tpidentifica = idtpidentifica_tpidentifica;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fechanacimiento = fechanacimiento;
		this.discapacitado = discapacitado;
		this.porcdiscapacidad = porcdiscapacidad;
		this.porcexonera = porcexonera;
		this.estado = estado;
		this.email = email;
		this.usucrea = usucrea;
		this.idnacionalidad_nacionalidad = idnacionalidad_nacionalidad;
		this.feccrea = feccrea;
		this.usumodi = usumodi;
		this.fecmodi = fecmodi;
		this.idpjuridica_personeriajuridica = idpjuridica_personeriajuridica;
	}

	public Clientes() {
		super();
	}

    public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}

    public void setCedula(String cedula) {
		this.cedula = cedula;
	}

    public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

    public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

    public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

    public void setDiscapacitado(Long discapacitado) {
		this.discapacitado = discapacitado;
	}

    public void setPorcexonera(Long porcexonera) {
		this.porcexonera = porcexonera;
	}

    public void setEstado(Long estado) {
		this.estado = estado;
	}

    public void setEmail(String email) {
		this.email = email;
	}

    public void setUsucrea(Long usucrea) {
		this.usucrea = usucrea;
	}

    public void setIdnacionalidad_nacionalidad(Nacionalidad idnacionalidad_nacionalidad) {
		this.idnacionalidad_nacionalidad = idnacionalidad_nacionalidad;
	}

    public void setFeccrea(LocalDate feccrea) {
		this.feccrea = feccrea;
	}

    public void setUsumodi(Long usumodi) {
		this.usumodi = usumodi;
	}

    public void setFecmodi(LocalDate fecmodi) {
		this.fecmodi = fecmodi;
	}

    public void setIdpjuridica_personeriajuridica(PersonJuridica idpjuridica_personeriajuridica) {
		this.idpjuridica_personeriajuridica = idpjuridica_personeriajuridica;
	}

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public void setPorcdiscapacidad(Long porcdiscapacidad) {
		this.porcdiscapacidad = porcdiscapacidad;
	}

    public void setIdtpidentifica_tpidentifica(Tpidentifica idtpidentifica_tpidentifica) {
		this.idtpidentifica_tpidentifica = idtpidentifica_tpidentifica;
	}
}
