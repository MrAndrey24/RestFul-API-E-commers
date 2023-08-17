package com.example.demo.Responses.Factory;

import com.example.demo.Domain.Descuento;
import com.example.demo.Domain.Empleado;
import com.example.demo.Responses.DescuentoResponse;
import com.example.demo.Responses.EmpleadoResponse;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;

public class DescuentoResponseFactory extends ResponseFactory<Descuento> {

    @Override
    public Response getResponse(ResponseType responseType, String message, Descuento data) {

        switch (responseType) {
            case OK:
                message = "Operacion para el descuento ejecutada correctamente";
                break;
            case WARNING:
                message = "Operacion para descuento ejecutada pero con errores";
                break;
            default:
                message = "Operacion para descuento no ejecutada";

                message = getStatusMessage(responseType, message);

                return new DescuentoResponse(responseType, message, null);
        }

        message = getStatusMessage(responseType, message);

        return new DescuentoResponse(responseType, message, (Descuento) data);

    }
}
