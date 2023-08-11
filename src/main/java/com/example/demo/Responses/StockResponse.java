package com.example.demo.Responses;

import com.example.demo.Domain.Stock;

public class StockResponse extends Response<Stock>{

    public StockResponse(ResponseType responseType, String message, Stock data) {
        super(responseType, message, data);
    }
}
