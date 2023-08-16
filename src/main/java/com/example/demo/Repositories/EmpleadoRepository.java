package com.example.demo.Repositories;

import com.example.demo.Domain.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpleadoRepository extends MongoRepository<Empleado, String> {
}
