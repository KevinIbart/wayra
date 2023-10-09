package com.example.wayra.repository;

import com.example.wayra.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findByNombres(String username);

   List<Usuario> findByRol(String rol);
}
