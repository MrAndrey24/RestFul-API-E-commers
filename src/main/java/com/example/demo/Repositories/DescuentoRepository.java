package com.example.demo.Repositories;

import com.example.demo.Domain.Descuento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DescuentoRepository extends MongoRepository<Descuento, String> {
}
