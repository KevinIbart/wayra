package com.example.wayra.controller;
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
public class CiudadController {
    @Autowired
    private CiudadService ciudadService;
}
