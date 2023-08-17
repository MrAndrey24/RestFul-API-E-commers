package com.example.demo.Responses.Factory;

import com.example.demo.Domain.Departamento;
import com.example.demo.Domain.Proveedor;
import com.example.demo.Responses.*;

public class ProveedorResponseFactory extends ResponseFactory<Proveedor> {

    @Override
    public Response getResponse(ResponseType responseType, String message, Proveedor data) {

        // logica de negocio
        switch (responseType) {
            case OK:
                message = "Operacion para proveedor ejecutada correctamente";
                break;
            case WARNING:
                message = "Operacion para proveedor ejecutada pero con errores";
                break;
            default:
                message = "Operacion para proveedor no ejecutada";

                message = getStatusMessage(responseType, message);

                return new ProveedorResponse(responseType, message, null);
        }

        message = getStatusMessage(responseType, message);

        return new ProveedorResponse(responseType, message, (Proveedor) data);
    }
}
