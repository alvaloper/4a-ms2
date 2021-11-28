package com.clapdigital.apiclap.controllers;
import com.clapdigital.apiclap.models.Municipio;
import com.clapdigital.apiclap.repositories.MunicipioRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class MunicipioController {
    private final MunicipioRepository municipioRepository;

    public MunicipioController(MunicipioRepository municipioRepository) {
        this.municipioRepository = municipioRepository;
    }

    @PostMapping("/municipio")
    Municipio newMunicipio(@RequestBody Municipio municipio){
        return municipioRepository.save(municipio);
    }

    @GetMapping("/municipio/{id_municipio}")
    Optional<Municipio> getMunicipio(@PathVariable String id_municipio){
        return municipioRepository.findById(id_municipio);
    }

    @DeleteMapping("/municipio/{id_municipio}")
    void deleteMunicipio(@PathVariable String id_municipio){
        municipioRepository.deleteById(id_municipio);
    }

    @PutMapping("/municipio/{id_municipio}")
    Municipio updateMunicipio(@PathVariable String id_municipio, @RequestBody Municipio new_municipio){
        Municipio old_municipio = municipioRepository.findById(id_municipio).orElse(null);
        old_municipio.setMunicipio(new_municipio.getMunicipio());
        return municipioRepository.save(old_municipio);
    }
}