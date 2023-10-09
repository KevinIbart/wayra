package com.example.wayra.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cliente;
    private String dni;
    private String nombreCliente;
    private String apellidoCliente;
    private int edad;
    private String email;
    private  String ntelefono;
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Ciudad ciudad;

    public Cliente() {
    }
    public Cliente(String dni, String nombreCliente, String apellidoCliente, int edad, String email, String ntelefono, String direccion, Ciudad ciudad) {
        this.dni = dni;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.edad = edad;
        this.ciudad = ciudad;
    }



    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNtelefono() {
        return ntelefono;
    }

    public void setNtelefono(String ntelefono) {
        this.ntelefono = ntelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
