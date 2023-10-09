package com.example.wayra.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
    @Entity
    @Table(name="usuario")

    public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id_usuario")
        private Integer idUsuario;

        @Column(name="email", nullable = false, unique = true)
        private String email;

        @Column(name="password", nullable = false)
        private String password;

        @Size(min=4, message="El nombre debe tener 4 caracteres")
        @Column(name="nombres", nullable=false, length=64)
        private String nombres;

        @Size(min=4, message="El apellido debe tener 4 caracteres")
        @Column(name="apellidos", nullable=false, length=64)
        private String apellidos;

        @Column(name = "Rol", nullable = false)
        private String rol;
}
