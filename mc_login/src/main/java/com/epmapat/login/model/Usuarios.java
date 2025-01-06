package com.epmapat.login.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.ZonedDateTime;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;
    private String identificausu;
    private String codusu;
    private String nomusu;
    private String email;
    private Boolean estado;
    private LocalDate fdesde;
    private LocalDate fhasta;
    private ZonedDateTime feccrea;
    private Long usumodi;
    private ZonedDateTime fecmodi;
    private Boolean otrapestania;
    private String alias;
    private String priusu;
    private String perfil;

    public Usuarios(){
        super();
    }

    public Usuarios(Long idusuario, String identificausu, String codusu, String nomusu, String email, Boolean estado, LocalDate fdesde, LocalDate fhasta, ZonedDateTime feccrea, Long usumodi, ZonedDateTime fecmodi, Boolean otrapestania, String alias, String priusu, String perfil) {
        this.idusuario = idusuario;
        this.identificausu = identificausu;
        this.codusu = codusu;
        this.nomusu = nomusu;
        this.email = email;
        this.estado = estado;
        this.fdesde = fdesde;
        this.fhasta = fhasta;
        this.feccrea = feccrea;
        this.usumodi = usumodi;
        this.fecmodi = fecmodi;
        this.otrapestania = otrapestania;
        this.alias = alias;
        this.priusu = priusu;
        this.perfil = perfil;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getIdentificausu() {
        return identificausu;
    }

    public void setIdentificausu(String identificausu) {
        this.identificausu = identificausu;
    }

    public String getCodusu() {
        return codusu;
    }

    public void setCodusu(String codusu) {
        this.codusu = codusu;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFdesde() {
        return fdesde;
    }

    public void setFdesde(LocalDate fdesde) {
        this.fdesde = fdesde;
    }

    public LocalDate getFhasta() {
        return fhasta;
    }

    public void setFhasta(LocalDate fhasta) {
        this.fhasta = fhasta;
    }

    public ZonedDateTime getFeccrea() {
        return feccrea;
    }

    public void setFeccrea(ZonedDateTime feccrea) {
        this.feccrea = feccrea;
    }

    public Long getUsumodi() {
        return usumodi;
    }

    public void setUsumodi(Long usumodi) {
        this.usumodi = usumodi;
    }

    public ZonedDateTime getFecmodi() {
        return fecmodi;
    }

    public void setFecmodi(ZonedDateTime fecmodi) {
        this.fecmodi = fecmodi;
    }

    public Boolean getOtrapestania() {
        return otrapestania;
    }

    public void setOtrapestania(Boolean otrapestania) {
        this.otrapestania = otrapestania;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPriusu() {
        return priusu;
    }

    public void setPriusu(String priusu) {
        this.priusu = priusu;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
