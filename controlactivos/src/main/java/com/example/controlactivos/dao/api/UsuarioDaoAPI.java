package com.example.controlactivos.dao.api;

import com.example.controlactivos.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioDaoAPI extends CrudRepository<Usuario, Long> {

	Usuario findByUsuario(String usuario);
}
