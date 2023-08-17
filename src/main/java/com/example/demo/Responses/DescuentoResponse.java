package com.example.demo.Responses;

import com.example.demo.Domain.Descuento;

public class DescuentoResponse extends Response<Descuento> {

    public DescuentoResponse(ResponseType responseType, String message, Descuento data) {
        super(responseType, message, data);
    }
}
