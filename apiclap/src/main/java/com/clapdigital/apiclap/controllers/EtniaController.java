package com.clapdigital.apiclap.controllers;
import com.clapdigital.apiclap.models.Etnia;
import com.clapdigital.apiclap.repositories.EtniaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class EtniaController {
    private final EtniaRepository etniaRepository;

    public EtniaController(EtniaRepository etniaRepository) {
        this.etniaRepository = etniaRepository;
    }

    @PostMapping("/etnia")
    Etnia newEtnia(@RequestBody Etnia etnia){
        return etniaRepository.save(etnia);
    }

    @GetMapping("/etnia/{id_etnia}")
    Optional<Etnia> getEtnia(@PathVariable String id_etnia){
        return etniaRepository.findById(id_etnia);
    }

    @DeleteMapping("/etnia/{id_etnia}")
    void deleteEtnia(@PathVariable String id_etnia){
        etniaRepository.deleteById(id_etnia);
    }

    @PutMapping("/etnia/{id_etnia}")
    Etnia updateEtnia(@PathVariable String id_etnia, @RequestBody Etnia new_etnia){
        Etnia old_etnia = etniaRepository.findById(id_etnia).orElse(null);
        old_etnia.setEtnia(new_etnia.getEtnia());
        return  etniaRepository.save(old_etnia);
    }
}