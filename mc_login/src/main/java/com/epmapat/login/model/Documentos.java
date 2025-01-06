package com.epmapat.login.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "documentos")
public class Documentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long intdoc;
    private String nomdoc;
    private Long tipdoc;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idtabla4")
    private Tabla4 idtabla4;
    private String tipocomprobante;
    private Long usucrea;
    @Column(name = "feccrea")
    private ZonedDateTime feccrea;
    private Long usumodi;
    @Column(name = "fecmodi")
    private ZonedDateTime fecmodi;

    public Documentos(Long intdoc, String nomdoc, Long tipdoc, Tabla4 idtabla4, String tipocomprobante, Long usucrea, ZonedDateTime feccrea, Long usumodi, ZonedDateTime fecmodi) {
        this.intdoc = intdoc;
        this.nomdoc = nomdoc;
        this.tipdoc = tipdoc;
        this.idtabla4 = idtabla4;
        this.tipocomprobante = tipocomprobante;
        this.usucrea = usucrea;
        this.feccrea = feccrea;
        this.usumodi = usumodi;
        this.fecmodi = fecmodi;
    }

    public Long getIntdoc() {
        return intdoc;
    }

    public void setIntdoc(Long intdoc) {
        this.intdoc = intdoc;
    }

    public String getNomdoc() {
        return nomdoc;
    }

    public void setNomdoc(String nomdoc) {
        this.nomdoc = nomdoc;
    }

    public Long getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(Long tipdoc) {
        this.tipdoc = tipdoc;
    }

    public Tabla4 getIdtabla4() {
        return idtabla4;
    }

    public void setIdtabla4(Tabla4 idtabla4) {
        this.idtabla4 = idtabla4;
    }

    public String getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(String tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    public Long getUsucrea() {
        return usucrea;
    }

    public void setUsucrea(Long usucrea) {
        this.usucrea = usucrea;
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
}
