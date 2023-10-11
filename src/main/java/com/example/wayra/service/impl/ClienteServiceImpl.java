package com.example.wayra.service.impl;

import com.example.wayra.model.Cliente;
import com.example.wayra.repository.ClienteRepository;
import com.example.wayra.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public Cliente createCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAll() {
        return this.clienteRepository.findAll();
    }


    @Override
    public void deleteClient(Integer dni) {
        this.clienteRepository.deleteById(dni);
    }

    @Override
    public Optional<Cliente> getClientByDni(Integer dni) {
        return this.clienteRepository.findById(dni);
    }

}
