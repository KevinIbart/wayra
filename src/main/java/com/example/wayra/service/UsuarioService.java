package com.example.wayra.service;
import com.example.wayra.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Usuario createUsuario(Usuario usuario);
    List<Usuario> getAll();
    Optional<Usuario> getUsuario(Integer id);
    void deleteUsuario(Integer idUsuario);
    Optional<Usuario> getUserByEmail(String email);
    List<Usuario> getUserByRol(String rol);
    Optional<Usuario> getUserByNombres(String nombre);
}
