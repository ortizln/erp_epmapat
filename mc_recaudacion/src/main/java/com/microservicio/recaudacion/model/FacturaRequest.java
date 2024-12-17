package com.microservicio.recaudacion.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class FacturaRequest {
    private List<Long> facturas;
    private Long autentification;
    private Recaudacion recaudacion;

}
