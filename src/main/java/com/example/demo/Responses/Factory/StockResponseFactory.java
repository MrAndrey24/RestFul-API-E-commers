package com.example.demo.Responses.Factory;

import com.example.demo.Domain.Stock;
import com.example.demo.Responses.*;

public class StockResponseFactory extends ResponseFactory<Stock> {


    @Override
    public Response getResponse(ResponseType responseType, String message, Stock data) {


        switch (responseType) {
            case OK:
                message = "Operacion para Stock ejecutada correctamente";
                break;
            case WARNING:
                message = "Operacion para Stock ejecutada pero con errores";
                break;
            default:
                message = "Operacion para Stock no ejecutada";

                message = getStatusMessage(responseType, message);

                return new ClienteResponse(responseType, message, null);
        }

        message = getStatusMessage(responseType, message);

        return new StockResponse(responseType, message, (Stock) data);
    }
}
