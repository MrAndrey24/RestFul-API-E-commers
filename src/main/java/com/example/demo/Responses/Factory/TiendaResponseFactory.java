package com.example.demo.Responses.Factory;

import com.example.demo.Domain.Tienda;
import com.example.demo.Responses.*;

public class TiendaResponseFactory extends ResponseFactory<Tienda> {
    @Override
    public Response getResponse(ResponseType responseType, String message, Tienda data) {

        // logica de negocio
        switch (responseType) {
            case OK:
                message = "Operacion para la tienda ejecutada correctamente";
                break;
            case WARNING:
                message = "Operacion para tienda ejecutada pero con errores";
                break;
            default:
                message = "Operacion para tienda no ejecutada";
        }

        message = getStatusMessage(responseType, message);

        return new TiendaResponse(responseType, message, (Tienda) data);
    }
}
