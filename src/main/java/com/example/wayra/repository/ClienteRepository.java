package com.example.wayra.repository;

import com.example.wayra.model.Cliente;
import com.example.wayra.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
