package com.example.demo.Controllers;

import com.example.demo.Domain.Stock;
import com.example.demo.Service.StockService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/stocks")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping
    public List<Stock> getStocks() {
        return stockService.getStocks();
    }

    @GetMapping("/{id}")
    public Stock getStock(@PathVariable String id) {
        return stockService.getStock(id);
    }

    @PostMapping
    public Stock addStock(@RequestBody Stock stock) {
        return stockService.addStock(stock);
    }

    @PutMapping("/{id}")
    public Stock updateStock(@PathVariable String id, @RequestBody Stock stock) {
        stock.setId(id);
        return stockService.updateStock(stock);
    }

    @DeleteMapping("/{id}")
    public String deleteStock(@PathVariable String id) {
        return stockService.deleteStock(id);
    }
}
