package com.example.demo.Responses;

import com.example.demo.Domain.Factura;

public class FacturaResponse extends Response<Factura> {

    public FacturaResponse(ResponseType responseType, String message, Factura data) {
        super(responseType, message, data);
    }
}
