package com.clapdigital.apiclap.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.clapdigital.apiclap.models.Departamento;

public interface DepartamentoRepository extends MongoRepository<Departamento, String> { }
