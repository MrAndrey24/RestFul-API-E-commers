package com.example.demo.Repositories;

import com.example.demo.Domain.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FacturaRepository extends MongoRepository<Factura, String> {
}
