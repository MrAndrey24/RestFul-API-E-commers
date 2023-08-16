package com.example.demo.Service;

import com.example.demo.Domain.Stock;
import com.example.demo.Repositories.StockRepository;
import com.example.demo.Responses.Factory.FacturaResponseFactory;
import com.example.demo.Responses.Factory.ResponseFactory;
import com.example.demo.Responses.Factory.StockResponseFactory;
import com.example.demo.Responses.FacturaResponse;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;
import com.example.demo.Responses.StockResponse;
import com.example.demo.Utils.Validaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getStocks() {
        return stockRepository.findAll();
    }

    public Response getStock(String id) {

        Stock stock = stockRepository.findById(id).orElse(null);

        if (stock == null) {
            ResponseFactory stockResponseFactory = new StockResponseFactory();

            return stockResponseFactory.getResponse(ResponseType.ERROR, "No se encontró el stock", null);

        }

        else {
            ResponseFactory stockResponseFactory = new StockResponseFactory();

            return stockResponseFactory.getResponse(ResponseType.OK, "Stock encontrado", stock);
        }
    }

    public Stock addStock(Stock stock) {

        return stockRepository.save(stock);
    }

    public Stock updateStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public String deleteStock(String id) {
        stockRepository.deleteById(id);
        return "Stock eliminado con éxito";
    }
}
