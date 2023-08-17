package com.example.demo.Responses.Factory;

import com.example.demo.Domain.Empleado;
import com.example.demo.Domain.Factura;
import com.example.demo.Responses.EmpleadoResponse;
import com.example.demo.Responses.FacturaResponse;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;

public class EmpleadoResponseFactory extends ResponseFactory<Empleado> {

    @Override
    public Response getResponse(ResponseType responseType, String message, Empleado data) {

        switch (responseType) {
            case OK:
                message = "Operacion para el empleado ejecutada correctamente";
                break;
            case WARNING:
                message = "Operacion para empleado ejecutada pero con errores";
                break;
            default:
                message = "Operacion para empleado no ejecutada";

                message = getStatusMessage(responseType, message);

                return new EmpleadoResponse(responseType, message, null);
        }

        message = getStatusMessage(responseType, message);

        return new EmpleadoResponse(responseType, message, (Empleado) data);

    }
}
