package com.example.demo.Repositories;

import com.example.demo.Domain.Departamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartamentoRepository extends MongoRepository<Departamento, String> {
}
