package com.example.wayra.controller;

import com.example.wayra.model.Cliente;
import com.example.wayra.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/cliente/")
public class ClienteController {
    @Autowired
    ClienteService clienteService;



}
