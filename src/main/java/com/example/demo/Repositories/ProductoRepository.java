package com.example.demo.Repositories;

import com.example.demo.Domain.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {
}
