package com.epmapat.erp_epmapat.modelo;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "emisiones")
public class Emisiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idemision;
    String emision;
    Integer estado;
    String observaciones;
    Long usuariocierre;
    @Column(name = "fechacierre")
    private ZonedDateTime fechacierre;
    Long m3;
    Long usucrea;
    Date feccrea;
    Long usumodi;
    Date fecmodi;

}
