package com.example.demo.Responses;

import com.example.demo.Domain.Empleado;

public class EmpleadoResponse extends Response<Empleado>{

    public EmpleadoResponse(ResponseType responseType, String message, Empleado data) {
        super(responseType, message, data);
    }
}
