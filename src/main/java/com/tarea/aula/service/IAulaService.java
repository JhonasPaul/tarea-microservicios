package com.tarea.aula.service;

import com.tarea.aula.model.Aula;

import java.util.List;

public interface IAulaService {
    public List<Aula> findAll();

    public void save(Aula aula);

    public Aula findById(Long id);

    public void delete(Aula aula);
}
