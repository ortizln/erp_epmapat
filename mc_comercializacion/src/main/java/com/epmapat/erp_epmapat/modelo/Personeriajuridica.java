package com.epmapat.erp_epmapat.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "personeriajuridica")
public class Personeriajuridica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpjuridica;
    private String descripcion;
}
