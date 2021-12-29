package com.clapdigital.apiclap.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.clapdigital.apiclap.models.Etnia;

public interface EtniaRepository extends MongoRepository<Etnia, String> { }