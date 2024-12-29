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
@Table(name="tpidentifica")
public class Tpidentifica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtpidentifica;
    private String codigo;
    private String nombre;
    private Long usucrea;
    private LocalDate feccrea;
    private Long usumodi;
    private LocalDate fecmodi;
}
