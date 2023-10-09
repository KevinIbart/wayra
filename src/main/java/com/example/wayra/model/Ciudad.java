package com.example.wayra.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_ciudad;
    private String nombre_ciudad;

    public Ciudad() {

    }
    public Ciudad(String nombre_ciudad) {
        super();
        this.nombre_ciudad = nombre_ciudad;
    }


    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }
}
