package com.example.wayra.service.impl;

import com.example.wayra.model.Cliente;
import com.example.wayra.model.Usuario;
import com.example.wayra.repository.UsuarioRepository;
import com.example.wayra.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private final UsuarioRepository clienteRepository;

    @Override
    public Usuario createCliente(Cliente cliente) {
        return null;
    }

    @Override
    public List<Cliente> getAll() {
        return null;
    }

    @Override
    public Optional<Cliente> getCliente(Integer id) {
        return Optional.empty();
    }

    @Override
    public void deleteClient(Integer idCliente) {

    }

    @Override
    public Optional<Cliente> getUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<Cliente> getClienteByRol(String rol) {
        return null;
    }

    @Override
    public Optional<Cliente> getClientByNombres(String nombre) {
        return Optional.empty();
    }
}
