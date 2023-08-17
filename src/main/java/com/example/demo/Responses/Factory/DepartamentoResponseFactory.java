package com.example.demo.Responses.Factory;

import com.example.demo.Domain.Cliente;
import com.example.demo.Domain.Departamento;
import com.example.demo.Domain.Factura;
import com.example.demo.Responses.*;

public class DepartamentoResponseFactory extends ResponseFactory<Departamento> {
    @Override
    public Response getResponse(ResponseType responseType, String message, Departamento data) {

        // logica de negocio
        switch (responseType) {
            case OK:
                message = "Operacion para el cliente ejecutada correctamente";
                break;
            case WARNING:
                message = "Operacion para cliente ejecutada pero con errores";
                break;
            default:
                message = "Operacion para cliente no ejecutada";

                message = getStatusMessage(responseType, message);

                return new DepartamentoResponse(responseType, message, null);
        }

        message = getStatusMessage(responseType, message);

        return new DepartamentoResponse(responseType, message, (Departamento) data);
    }
}
