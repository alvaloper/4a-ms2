package com.clapdigital.apiclap.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.clapdigital.apiclap.models.Documento;

public interface DocumentoRepository extends MongoRepository<Documento, String>  { }