package com.example.wayra.rest;

import com.example.wayra.model.Ciudad;
import com.example.wayra.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudad/")
public class CiudadREST {
    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    public ResponseEntity< List<Ciudad> > getAllCiudades(){
        return ResponseEntity.ok(ciudadService.findAll());
    }
}
