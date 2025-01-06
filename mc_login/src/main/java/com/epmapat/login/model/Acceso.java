package com.epmapat.login.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "acceso")
public class Acceso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idacc;
    private String codacc;
    private String nomacc;
    private Integer regacc;

    public Acceso(Long idacc, String codacc, String nomacc, Integer regacc) {
        this.idacc = idacc;
        this.codacc = codacc;
        this.nomacc = nomacc;
        this.regacc = regacc;
    }

    public Long getIdacc() {
        return idacc;
    }

    public void setIdacc(Long idacc) {
        this.idacc = idacc;
    }

    public String getCodacc() {
        return codacc;
    }

    public void setCodacc(String codacc) {
        this.codacc = codacc;
    }

    public String getNomacc() {
        return nomacc;
    }

    public void setNomacc(String nomacc) {
        this.nomacc = nomacc;
    }

    public Integer getRegacc() {
        return regacc;
    }

    public void setRegacc(Integer regacc) {
        this.regacc = regacc;
    }
}
