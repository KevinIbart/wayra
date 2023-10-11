package com.example.wayra.model;
import lombok.Data;
import jakarta.persistence.*;

import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dniCliente", unique = true, length=8)
    private Integer dniCliente;

    @Size(min=2, message="Ingrese el nombre")
    @Column(name="nombre", nullable=false, length=64)
    private String nombre;

    @Size(min=2, message="Ingrese el apellido")
    @Column(name="apellidos", nullable=false, length=64)
    private String apellidos;

    @Column(name="telefono", nullable = false, unique = true, length=9)
    private String telefono;
    @Column(name="direccion", nullable = false, length=100)
    private String direccion;


}
