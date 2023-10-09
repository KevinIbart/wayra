package com.example.wayra.controller;

import com.example.wayra.model.Usuario;
import com.example.wayra.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    private final UsuarioService usuarioService;

    UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    //Crear Usuario
    @PostMapping
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(this.usuarioService.createUsuario(usuario), HttpStatus.CREATED);
    }

    //Listar Usuario
    @GetMapping
    public ResponseEntity<List<Usuario>> getAll() {
        return new ResponseEntity<List<Usuario>>(this.usuarioService.getAll(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Integer id) {
        Usuario usuario = this.usuarioService.getUsuario(id).get();
        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }

    @GetMapping("/rol")
    public ResponseEntity<List<Usuario>> obtenerUsuariosPorRol(@RequestParam("rol") String rol) {
        List<Usuario> usuariosPorRol = usuarioService.getUserByRol(rol);
        return new ResponseEntity<>(usuariosPorRol, HttpStatus.OK);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteUsuario(@PathVariable("id") Integer id) {
        this.usuarioService.deleteUsuario(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}