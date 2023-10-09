package com.example.wayra.model;

import jakarta.persistence.*;

import javax.validation.constraints.Size;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dniCliente", unique = true)
    private Integer dniCliente;

    @Size(min=2, message="Ingrese el nombre")
    @Column(name="nombre", nullable=false, length=64)
    private String nombre;

    @Size(min=2, message="Ingrese el apellido")
    @Column(name="apellidos", nullable=false, length=64)
    private String apellidos;

    @Column(name="telefono", nullable = false, unique = true)
    private String telefono;


}
