package com.example.wayra.service;

import com.example.wayra.model.Cliente;
import com.example.wayra.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Usuario createCliente(Cliente cliente);
    List<Cliente> getAll();
    Optional<Cliente> getCliente(Integer id);
    void deleteClient(Integer idCliente);
    Optional<Cliente> getUserByEmail(String email);
    List<Cliente> getClienteByRol(String rol);
    Optional<Cliente> getClientByNombres(String nombre);
}
