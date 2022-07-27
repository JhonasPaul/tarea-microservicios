package com.tarea.aula.controller;


import com.tarea.aula.model.Aula;
import com.tarea.aula.service.IAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/api")
public class AulaController {
    @Autowired
    private IAulaService service;

    @GetMapping("/aulas")
    public @ResponseBody List<Aula> index() {
        return service.findAll();
    }


    @GetMapping("/aulas/{id}")
    public @ResponseBody Aula show(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping("/aulas")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Aula create(@RequestBody Aula cliente) {
        this.service.save(cliente);
        return cliente;
    }

    @PutMapping("/aulas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Aula update(@RequestBody Aula cliente, @PathVariable Long id) {
        Aula aulaActual = this.service.findById(id);
        aulaActual.setAula(cliente.getAula());
        this.service.save(aulaActual);
        return aulaActual;
    }

    @DeleteMapping("/aulas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public @ResponseBody void delete(@PathVariable Long id) {
        Aula aulaActual = this.service.findById(id);
        this.service.delete(aulaActual);
    }
}
