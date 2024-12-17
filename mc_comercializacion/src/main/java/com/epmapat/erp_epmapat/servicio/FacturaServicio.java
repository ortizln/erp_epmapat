package com.epmapat.erp_epmapat.servicio;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.epmapat.erp_epmapat.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.epmapat.erp_epmapat.modelo.Facturas;
import com.epmapat.erp_epmapat.repositorio.FacturasR;

@Service
public class FacturaServicio {

	@Autowired
	private FacturasR dao;
	public Facturas validarUltimafactura(String codrecaudador) {
		return dao.validarUltimafactura(codrecaudador);
	}

	public List<Facturas> findByUsucobro(Long idusuario, Date dfecha, Date hfecha) {
		return dao.findByUsucobro(idusuario, dfecha, hfecha);
	}

	public List<FacturasI> findByFechacobro(Date fechacobro) {
		return dao.findByFechacobro(fechacobro);
	}

	public List<Facturas> findAll() {
		return dao.findAll();
	}

	public List<Facturas> findDesde(Long desde, Long hasta) {
		return dao.findDesde(desde, hasta);
	}

	@SuppressWarnings("null")
	public Optional<Facturas> findById(Long idfactura) {
		return dao.findById(idfactura);
	}

	// Planillas por Cliente
	public List<Facturas> findByIdcliente(Long idcliente) {
		return dao.findByIdcliente(idcliente);
	}

	// Planillas por Abonado
	public List<Facturas> findByIdabonado(Long idabonado) {
		return dao.findByIdabonado(idabonado);
	}

	public List<Facturas> findByIdabonadoLimit(Long idabonado, Long limit) {
		return dao.findByIdabonadoLimit(idabonado, limit);
	}

	// Una Planilla (como lista)
	public List<Facturas> buscarPlanilla(Long idfactura) {
		return dao.findByIdfactura(idfactura);
	}

	// Planillas por Abonado y Fecha
	public List<Facturas> buscarPorAbonadoYFechaCreacionRange(Long idabonado, LocalDate fechaDesde,
			LocalDate fechaHasta) {
		return dao.findByAbonadoAndFechaCreacionRange(idabonado, fechaDesde, fechaHasta);
	}

	// Planillas Sin Cobrar de un Cliente

	public List<Facturas> findSinCobro(Long idcliente) {
		return dao.findSinCobro(idcliente);
	}

	public List<FacSinCobrar> findFacSincobro(Long idcliente) {
		return dao.findFacSincobro(idcliente);
	}

	public List<FacSinCobrar> findFacSincobroByCuetna(Long cuenta) {
		return dao.findFacSincobroByCuetna(cuenta);
	}

	// Planillas Sin Cobrar de un Abonado (para Multas)
	public List<Long> findSinCobroAbo(Long idabonado) {
		return dao.findSinCobroAbo(idabonado);
	}

	// Cuenta las Planillas Pendientes de un Abonado
	public long getCantidadFacturasByAbonadoAndPendientes(Long idabonado) {
		return dao.countFacturasByAbonadoAndPendientes(idabonado);
	}

	// Planillas Sin Cobrar de un Abonado (Para convenios)
	public List<Facturas> findSinCobrarAbo(Long idmodulo, Long idabonado) {
		return dao.findSinCobrarAbo(idmodulo, idabonado);
	}

	public List<Facturas> findSinCobrarAboMod(Long idabonado) {
		return dao.findSinCobrarAboMod(idabonado);
	}

	public Long countSinCobrarAbo(Long idabonado) {
		return dao.countSinCobrarAbo(idabonado);
	}

	// Recaudación diaria - Facturas cobrasdas <Facturas>
	// public List<Facturas> findByFechacobro(LocalDate fecha) {
	// return dao.findByFechacobro(fecha);
	// }

	// Recaudación diaria - Facturas cobradas (Sumando los rubros)
	public List<RepFacGlobal> findByFechacobroTotRangos(LocalDate d_fecha, LocalDate h_fecha) {
		return dao.findByFechacobroTotRangos(d_fecha, h_fecha);
	}

	public List<RepFacGlobal> findByFechacobroTotByRecaudador(LocalDate d_fecha, LocalDate h_fecha, Long idrecaudador) {
		return dao.findByFechacobroTotByRecaudador(d_fecha, h_fecha, idrecaudador);
	}

	// Total diario por Forma de cobro
	public List<Object[]> totalFechaFormacobroRangos(LocalDate d_fecha, LocalDate h_fecha) {
		return dao.totalFechaFormacobroRangos(d_fecha, h_fecha);
	}

	// Total diario por Forma de cobro
	public List<Object[]> totalFechaFormacobroByRecaudador(LocalDate d_fecha, LocalDate h_fecha, Long idrecaudador) {
		return dao.totalFechaFormacobroByRecaudador(d_fecha, h_fecha, idrecaudador);
	}

	public List<RepFacGlobal> findByFechacobroTot(LocalDate fecha) {
		return dao.findByFechacobroTot(fecha);
	}

	// Total diario por Forma de cobro
	public List<Object[]> totalFechaFormacobro(LocalDate fecha) {
		return dao.totalFechaFormacobro(fecha);
	}

	@SuppressWarnings("null")
	public void deleteById(Long id) {
		dao.deleteById(id);
	}

	public List<Facturas> findByIdFactura(Long idabonado) {
		return dao.findByIdFactura(idabonado);
	}

	public List<Facturas> findByNrofactura(String nrofactura) {
		return dao.findByNrofactura(nrofactura);
	}

	public <S extends Facturas> S save(S entity) {
		return dao.save(entity);
	}

	public <S extends Facturas> S saveForNewEmision(S entity) {

		return dao.save(entity);
	}

	public FacturasR getDao() {
		return dao;
	}

	public void setDao(FacturasR dao) {
		this.dao = dao;
	}

	// FACTURAS ANULACIÓN
	public List<Facturas> fingAllFacturasAnuladas(Long limit) {
		return this.dao.fingAllFacturasAnuladas(limit);
	}

	public List<Facturas> findCobradasByCliente(Long idcliente) {
		return this.dao.findCobradasByCliente(idcliente);
	}

	// FACTURAS ELIMINACIÓN
	public List<Facturas> fingAllFacturasEliminadas(Long limit) {
		return this.dao.fingAllFacturasEliminadas(limit);
	}

	public List<Facturas> findByFecEliminacion(Date d, Date h) {
		return this.dao.findByFecEliminacion(d, h);
	}

	public List<Facturas> findByFecAnulacion(Date d, Date h) {
		return this.dao.findByFecAnulacion(d, h);
	}

	/* transferencias cobradas */
	public List<Object[]> transferenciasCobradas(Date d_fecha, Date h_fecha) {
		return this.dao.transferenciasCobradas(d_fecha, h_fecha);
	}

	public List<Facturas> findFechaCobro(LocalDate d, LocalDate h) {
		return this.dao.findFechaCobro(d, h);
	}

	// Cartera a una fecha
	public List<Facturas> cartera(LocalDate hasta) {
		return dao.cartera(hasta);
	}

	// Cartera de un cliente a una fecha (Facturas)
	public List<Facturas> carteraCliente(Long idcliente, LocalDate hasta) {
		return dao.carteraCliente(idcliente, hasta);
	}

	// Cartera de un cliente a una fecha (Total, ya suma 1 a los del módulo 3)
	public Double totCarteraCliente(Long idcliente, LocalDate hasta) {
		return dao.totCarteraCliente(idcliente, hasta);
	}

	/* REPORTE DE FACTURAS ELIMINADAS POR RANGO DE FECHA */
	public List<RepFacEliminadas> findEliminadasXfecha(LocalDate d, LocalDate h) {
		return dao.findEliminadasXfecha(d, h);
	}

	/* REPORTE DE FACTURAS ANULADAS POR RANGO DE FECHA */
	public List<RepFacEliminadas> findAnuladasXfecha(LocalDate d, LocalDate h) {
		return dao.findAnuladasXfecha(d, h);
	}

	public List<FacIntereses> getForIntereses(Long idfactura) {
		return dao.getForIntereses(idfactura);
	}

	// REPORTES DE FACTURAS TRANSFERENCIAS
	public List<FacTransferencias> getFacAllTransferidas(LocalDate d, LocalDate h) {
		return dao.getFacAllTransferidas(d, h);
	}

	public List<FacTransferencias> getFacPagadasTransferidas(LocalDate d, LocalDate h) {
		return dao.getFacPagadasTransferidas(d, h);
	}

	public List<FacTransferencias> getFacNoPagadasTransferidas(LocalDate d, LocalDate h) {
		return dao.getFacNoPagadasTransferidas(d, h);
	}
	/* CARTERA VENCIDA POR FACTURAS */

	public List<CarteraVencidaFacturas> getCVByFacturasConsumo(LocalDate fecha) {
		return dao.getCVByFacturasConsumo(fecha);
	}

	public List<CVFacturasNoConsumo> getCVByFacturasNoConsumo(LocalDate fecha) {
		return dao.getCVByFacturasNoConsumo(fecha);
	}

}
