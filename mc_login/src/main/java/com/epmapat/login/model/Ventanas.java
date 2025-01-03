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
@Table(name ="ventanas")
public class Ventanas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idventana;
    private String nombre;
    private String color1;
    private String color2;
    private Long idusuario;

    public Ventanas(Long idventana, String nombre, String color1, String color2, Long idusuario) {
        this.idventana = idventana;
        this.nombre = nombre;
        this.color1 = color1;
        this.color2 = color2;
        this.idusuario = idusuario;
    }

    public Long getIdventana() {
        return idventana;
    }

    public void setIdventana(Long idventana) {
        this.idventana = idventana;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }
}
