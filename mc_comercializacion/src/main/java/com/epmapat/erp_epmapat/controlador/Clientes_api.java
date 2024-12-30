package com.epmapat.erp_epmapat.controlador;

import com.epmapat.erp_epmapat.DTO.Clientes_dto;
import com.epmapat.erp_epmapat.excepciones.ResourceNotFoundExcepciones;
import com.epmapat.erp_epmapat.modelo.Clientes;
import com.epmapat.erp_epmapat.servicio.Clientes_ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class Clientes_api {
    @Autowired
    private Clientes_ser s_clietnes;

    @GetMapping
    public List<Clientes> getAllClientes(@Param(value = "identificacion") String identificacion,
                                         @Param(value = "nombre") String nombre, @Param(value = "nombreIdentifi") String nombreIdentifi,
                                         @Param(value = "idused") Long idused) {
        if (nombreIdentifi != null) {
            return s_clietnes.findByNombreIdentifi(nombreIdentifi.toLowerCase());
        }
        if (identificacion != null) {
            return s_clietnes.findByIdentificacion(identificacion);
        }
        if (nombre != null) {
            return s_clietnes.findByNombre(nombre.toLowerCase());
        }
        if (idused != null) {
            return s_clietnes.used(idused);
        } else
            return null;
    }

    @GetMapping("/{idcliente}")
    public ResponseEntity<Clientes> getByIdCliente(@PathVariable Long idcliente) {
        Clientes clienteM = s_clietnes.findById(idcliente)
                .orElseThrow(() -> new ResourceNotFoundExcepciones(("No existe ese cliente con ese Id: " + idcliente)));
        return ResponseEntity.ok(clienteM);
    }

    // Valida Identificación del Cliente
    @GetMapping("/valIdentificacion")
    public ResponseEntity<Boolean> valIdentificacion(@Param(value = "identificacion") String identificacion) {
        boolean rtn = s_clietnes.valIdentificacion(identificacion);
        return ResponseEntity.ok(rtn);
    }

    // Valida nomre de Cliente
    @GetMapping("/valNombre")
    public ResponseEntity<Boolean> valNombre(@Param(value = "nombre") String nombre) {
        boolean rtn = s_clietnes.valNombre(nombre.toLowerCase());
        return ResponseEntity.ok(rtn);
    }

    @GetMapping("/campos")
    public List<Map<String, Object>> obtenerTodosLosCampos() {
        return s_clietnes.obtenerCampos();
    }

    @PostMapping
    public ResponseEntity<Clientes> saveClientes(@RequestBody Clientes clienteM) {
        boolean resp = validadorDeCedula(clienteM.getCedula());
        if (resp == true) {
            return ResponseEntity.ok(s_clietnes.save(clienteM));
        } else {
            if (clienteM.getCedula().length() <= 13) {
                return ResponseEntity.ok(s_clietnes.save(clienteM));
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    }

    @PutMapping(value = "/{idcliente}")
    public ResponseEntity<Clientes> updateCliente(@PathVariable Long idcliente, @RequestBody Clientes clientem) {
        Clientes clienteM = s_clietnes.findById(idcliente)
                .orElseThrow(() -> new ResourceNotFoundExcepciones("No Existe ese cliente con ese Id: " + idcliente));
        clienteM.setCedula(clientem.getCedula());
        clienteM.setNombre(clientem.getNombre());
        clienteM.setDireccion(clientem.getDireccion());
        clienteM.setTelefono(clientem.getTelefono());
        clienteM.setFechanacimiento(clientem.getFechanacimiento());
        clienteM.setDiscapacitado(clientem.getDiscapacitado());
        clienteM.setIdtpidentifica_tpidentifica(clientem.getIdtpidentifica_tpidentifica());
        clienteM.setPorcexonera(clientem.getPorcexonera());
        clienteM.setEstado(clientem.getEstado());
        clienteM.setEmail(clientem.getEmail());
        clienteM.setUsucrea(clientem.getUsucrea());
        clienteM.setFeccrea(clientem.getFeccrea());
        clienteM.setUsumodi(clientem.getUsumodi());
        clienteM.setFecmodi(clientem.getFecmodi());
        clienteM.setIdpjuridica_personeriajuridica(clientem.getIdpjuridica_personeriajuridica());
        Clientes updateCliente = s_clietnes.save(clienteM);
        return ResponseEntity.ok(updateCliente);
    }

    @DeleteMapping(value = "/{idcliente}")
    public ResponseEntity<Object> deleteCliente(@PathVariable("idcliente") Long idcliente) {
        s_clietnes.deleteById(idcliente);
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @GetMapping("/total")
    public ResponseEntity<Long> getTotalClientes() {
        return ResponseEntity.ok(s_clietnes.totalclientes());
    }

    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    // Coeficientes de validación cédula
                    // El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
        }
        return cedulaCorrecta;
    }

    @GetMapping("/reportes/carteravencida")
    ResponseEntity<List<Clientes_dto>> getCVByCliente(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fecha) {
        return ResponseEntity.ok(s_clietnes.getCVByCliente(fecha));
    }
}
