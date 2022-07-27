package com.tarea.aula.service;

import com.tarea.aula.model.Aula;
import com.tarea.aula.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaServiceImp implements IAulaService{

    @Autowired
    private AulaRepository repository;

    @Override
    public List<Aula> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Aula aula) {
        repository.save(aula);
    }

    @Override
    public Aula findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Aula aula) {
        repository.delete(aula);
    }
}
