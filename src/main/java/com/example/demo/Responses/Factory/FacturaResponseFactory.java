package com.example.demo.Responses.Factory;

import com.example.demo.Domain.Factura;
import com.example.demo.Responses.*;

public class FacturaResponseFactory extends ResponseFactory<Factura> {

    @Override
    public Response getResponse(ResponseType responseType, String message, Factura data) {

        switch (responseType) {
            case OK:
                message = "Operacion para el factura ejecutada correctamente";
                break;
            case WARNING:
                message = "Operacion para factura ejecutada pero con errores";
                break;
            default:
                message = "Operacion para factura no ejecutada";

                message = getStatusMessage(responseType, message);

                return new ClienteResponse(responseType, message, null);
        }

        message = getStatusMessage(responseType, message);

        return new FacturaResponse(responseType, message, (Factura) data);

    }
}
