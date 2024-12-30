package com.epmapat.erp_epmapat.DTO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
public class Clientes_dto {
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
    private String idnacionalidad_nacionalidad;
    private LocalDate feccrea;
    private Long usumodi;
    private LocalDate fecmodi;
    private String idpjuridica_personeriajuridica;
    private String idtpidentifica_tpidentifica;
}
