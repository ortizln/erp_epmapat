package com.epmapat.erp_epmapat.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;
    private String cedula;
    private String direccion;
    private String telefono;
    private LocalDate fechanacimiento;
    private Long discapacitado;
    private Long porcdiscapacidad;
    private Long porcexonera;
    private Long estado;
    private String email;
    private Long usucrea;
    private Nacionalidad idnacionalidad_nacionalidad;
    private LocalDate feccrea;
    private Long usumodi;
    private LocalDate fecmodi;
    private Personeriajuridica idpjuridica_personeriajuridica;
    private Tpidentifica idtpidentifica_tpidentifica;
}
