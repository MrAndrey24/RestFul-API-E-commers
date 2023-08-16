package com.example.demo.Repositories;

import com.example.demo.Domain.Tienda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TiendaRepository extends MongoRepository<Tienda, String> {
}
