package com.example.wayra.controller;

import com.example.wayra.model.Cliente;
import com.example.wayra.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/cliente/")
public class ClienteController {

    private final ClienteService clienteService;

    ClienteController(ClienteService usuarioService) {
        this.clienteService = usuarioService;
    }

    //Crear Cliente
    @PostMapping
    public ResponseEntity<Cliente> createUsuario(@RequestBody Cliente cliente ) {
        return new ResponseEntity<>(this.clienteService.createCliente(cliente), HttpStatus.CREATED);
    }

    //Listar Cliente
    @GetMapping
    public ResponseEntity<List<Cliente>> getAll() {
        return new ResponseEntity<List<Cliente>>(this.clienteService.getAll(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obtenerUsuarioPorId(@PathVariable Integer dni) {
        Cliente cliente = this.clienteService.getClientByDni(dni).get();
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<Void> deleteUsuario(@PathVariable("id") Integer id) {
        this.clienteService.deleteClient(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


}
