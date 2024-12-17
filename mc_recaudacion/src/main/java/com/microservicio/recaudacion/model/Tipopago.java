package com.microservicio.recaudacion.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "abonados")
public class Tipopago {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtipopago;
	private String descripcion;
	private Long usucrea;
}
