package com.example.wayra.service.impl;

import com.example.wayra.model.Usuario;
import com.example.wayra.repository.UsuarioRepository;
import com.example.wayra.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;
    @Override
    public Usuario createUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAll() {
        return this.usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getUsuario(Integer id) {
        return this.usuarioRepository.findById(id);
    }

    @Override
    public void deleteUsuario(Integer idUsuario) {
        this.usuarioRepository.deleteById(idUsuario);
    }

    @Override
    public Optional<Usuario> getUserByEmail(String email) {
        return this.usuarioRepository.findByEmail(email);
    }

    @Override
    public List<Usuario> getUserByRol(String rol) {
        return this.usuarioRepository.findByRol(rol);
    }

    @Override
    public Optional<Usuario> getUserByNombres(String nombres) {
        return this.usuarioRepository.findByNombres(nombres);
    }

}
