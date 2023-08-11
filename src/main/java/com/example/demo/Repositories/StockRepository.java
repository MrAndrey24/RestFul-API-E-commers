package com.example.demo.Repositories;

import com.example.demo.Domain.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock, String> {
}
