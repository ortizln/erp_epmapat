package com.epmapat.login.controller;

import com.epmapat.login.interfaces.UsuarioI;
import com.epmapat.login.model.Usuarios;
import com.epmapat.login.service.Usuarios_ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class Usuarios_api {

    @Autowired
    private Usuarios_ser usuServicio;

    @GetMapping
    public List<Usuarios> getAll() {
        return usuServicio.findAll();
    }

    @GetMapping("/usuario")
    public Usuarios getUsuario(@Param(value = "a") String a, @Param(value = "b") String b) {
        if (a != null && b != null) {
            return usuServicio.findUsuario(a, b);
        } else {
            return null;
        }
    }

    // Va a servir para validar
    @GetMapping("/identificacion")
    public Usuarios getByIdentificausu(@Param(value = "identificausu") String identificausu) {
        if (identificausu != null) {
            return usuServicio.findByIdentificausu(identificausu);
        } else {
            return null;
        }
    }

    @GetMapping("/{idusuario}")
    public ResponseEntity<Usuarios> getByIdusuario(@PathVariable Long idusuario) {
        Usuarios usuario = usuServicio.findById(idusuario).orElseThrow();
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("/{idusuario}")
    public ResponseEntity<Usuarios> update(@PathVariable Long idusuario, @RequestBody Usuarios x) {
        Usuarios y = usuServicio.findById(idusuario).orElseThrow();
        y.setIdentificausu(x.getIdentificausu());
        y.setNomusu(x.getNomusu());
        y.setCodusu(x.getCodusu());
        y.setFdesde(x.getFdesde());
        y.setFhasta(x.getFhasta());
        y.setEstado(x.getEstado());
        y.setEmail(x.getEmail());
        y.setFeccrea(x.getFeccrea());
        y.setUsumodi(x.getUsumodi());
        y.setFecmodi(x.getFecmodi());
        y.setOtrapestania(x.getOtrapestania());
        y.setAlias(x.getAlias());
        y.setPriusu(x.getPriusu());
        y.setPerfil(x.getPerfil());
        Usuarios actualizar = usuServicio.save(y);
        return ResponseEntity.ok(actualizar);
    }

    @GetMapping("one")
    public ResponseEntity<UsuarioI> findDatosById(@RequestParam Long idusuario) {
        UsuarioI usuario = usuServicio.findDatosById(idusuario);
        return ResponseEntity.ok(usuario);
    }
}
