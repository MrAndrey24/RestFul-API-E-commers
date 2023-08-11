package com.example.demo.Responses;

import com.example.demo.Domain.Cliente;

public class ClienteResponse extends Response<Cliente> {

    public ClienteResponse(ResponseType responseType, String message, Cliente data) {
        super(responseType, message, data);
    }
}
