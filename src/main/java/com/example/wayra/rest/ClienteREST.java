package com.example.wayra.rest;

import com.example.wayra.model.Cliente;
import com.example.wayra.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente/")
public class ClienteREST {
    @Autowired
    ClienteService clienteService;

    @GetMapping
    private ResponseEntity<List<Cliente>> getAllClientes(){
        return ResponseEntity.ok(clienteService.findAll());
    }

    @PostMapping
    private ResponseEntity<Cliente> createPersona(@RequestBody Cliente cliente){
        try {
            Cliente clienteNuevo = clienteService.save(cliente);
            return ResponseEntity.created(new URI("/cliente/"+clienteNuevo.getId_cliente())).body(clienteNuevo);
        } catch (URISyntaxException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }


}
