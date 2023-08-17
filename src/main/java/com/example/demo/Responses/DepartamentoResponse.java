package com.example.demo.Responses;

import com.example.demo.Domain.Cliente;
import com.example.demo.Domain.Departamento;

public class DepartamentoResponse extends Response<Departamento> {

    public DepartamentoResponse(ResponseType responseType, String message, Departamento data) {
        super(responseType, message, data);
    }
}
