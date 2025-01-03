package com.epmapat.login.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "colores")
public class Colores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcolor;
    private String codigo;
    private String nombre;
    private String nombrecss;
    private String hexadecimal;
    private String rgb;
}
