package com.clapdigital.apiclap.controllers;
import com.clapdigital.apiclap.exceptions.DepartamentoNotFoundException;
import  com.clapdigital.apiclap.models.Departamento;
import com.clapdigital.apiclap.repositories.DepartamentoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
    private final DepartamentoRepository departamentoRepository;

    public DepartamentoController(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    @PostMapping("/departamento")
    Departamento newDepartamento(@RequestBody Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    @GetMapping("/departamento")
    public List<Departamento> getAllDepartamentos() {
        return departamentoRepository.findAll();
    }

    @GetMapping("/departamento/{id_departamento}")
    Departamento getDepartamento(@PathVariable String id_departamento){
        return departamentoRepository.findById(id_departamento)
                .orElseThrow(() -> new DepartamentoNotFoundException("No se encontró el nombre del Departamento"));
    }

    @DeleteMapping("/departamento/{id_departamento}")
    void deleteDepartamento(@PathVariable String id_departamento){
        departamentoRepository.deleteById(id_departamento);
    }

    @PutMapping("/departamento/{id_departamento}")
    Departamento updateDepartamento(@PathVariable String id_departamento, @RequestBody Departamento new_departamento){
        Departamento old_departamento = departamentoRepository.findById(id_departamento).orElse(null);
        old_departamento.setDepartamento(new_departamento.getDepartamento());
        return departamentoRepository.save(old_departamento);
    }
}
