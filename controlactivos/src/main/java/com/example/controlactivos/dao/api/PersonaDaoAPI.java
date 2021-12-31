package com.example.controlactivos.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.example.controlactivos.model.Persona;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {

}
