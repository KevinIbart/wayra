package com.example.wayra.service;

import com.example.wayra.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    Cliente createCliente(Cliente cliente);
    List<Cliente> getAll();
    void deleteClient(Integer idCliente);
    Optional<Cliente> getClientByDni(Integer dni);
}
