package com.clapdigital.apiclap.controllers;
import com.clapdigital.apiclap.models.Documento;
import org.springframework.web.bind.annotation.*;
import com.clapdigital.apiclap.repositories.DocumentoRepository;
import com.clapdigital.apiclap.exceptions.DocumentoNotFoundException;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")

public class DocumentoController {
    private final DocumentoRepository documentoRepository;

    public DocumentoController(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }

//    @PostMapping("/documentos")
//        public ResponseEntity<Documento> createDocumento(@RequestBody Documento documento) {
//        try {
//            Documento _documento = documentoRepository.save(new Documento(documento.getTipodocumento()));
//            return new ResponseEntity<>(_documento, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

    @PostMapping("/documentos")
    Documento newDocumento(@RequestBody Documento documento){
        return documentoRepository.save(documento);
    }

    @GetMapping("/documentos")
    public List<Documento> getAllDocumentos() {
        return documentoRepository.findAll();
    }

    @GetMapping("/documentos/{Id}")
    Documento getDocumento(@PathVariable String Id){
        return documentoRepository.findById(Id)
                .orElseThrow(() -> new DocumentoNotFoundException("No se encontró el tipo de Documento"));
    }

    @DeleteMapping("/documentos/{Id}")
    void deleteDocumento(@PathVariable String Id){
        documentoRepository.deleteById(Id);
    }

    @PutMapping("/documentos/{Id}")
    Documento updateDocumento(@PathVariable String Id, @RequestBody Documento new_documento){
        Documento old_documento = documentoRepository.findById(Id).orElse(null);
        old_documento.setTipodocumento(new_documento.getTipodocumento());
        return documentoRepository.save(old_documento);
    }
}
