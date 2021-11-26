package com.clapdigital.apiclap.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.clapdigital.apiclap.models.Municipio;

public interface MunicipioRepository extends MongoRepository<Municipio, String> { }