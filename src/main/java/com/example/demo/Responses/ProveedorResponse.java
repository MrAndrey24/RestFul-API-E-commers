package com.example.demo.Responses;

import com.example.demo.Domain.Proveedor;

public class ProveedorResponse extends Response<Proveedor>{

    public ProveedorResponse(ResponseType responseType, String message, Proveedor data) {
        super(responseType, message, data);
    }
}
