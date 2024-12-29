package com.epmapat.erp_epmapat.modelo.microserviceRecaudacion;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class FacturaRequest {
    private List<Long> facturas;
    private Long autentification;
   // private Recaudacion recaudacion;

}