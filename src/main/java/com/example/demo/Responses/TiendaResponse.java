package com.example.demo.Responses;

import com.example.demo.Domain.Tienda;

public class TiendaResponse extends Response<Tienda>{

    public TiendaResponse(ResponseType responseType, String message, Tienda data) {
        super(responseType, message, data);
    }
}
