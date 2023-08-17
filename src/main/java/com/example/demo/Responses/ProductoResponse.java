package com.example.demo.Responses;

import com.example.demo.Domain.Cliente;
import com.example.demo.Domain.Producto;

public class ProductoResponse extends Response<Producto> {

    public ProductoResponse(ResponseType responseType, String message, Producto data) {
        super(responseType, message, data);
    }
}
