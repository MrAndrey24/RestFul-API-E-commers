package com.example.demo.Repositories;

import com.example.demo.Domain.Proveedor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProveedorRepository extends MongoRepository<Proveedor, String> {
}
