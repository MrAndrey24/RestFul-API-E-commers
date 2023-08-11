package com.example.demo.Responses.Factory;

import com.example.demo.Responses.IResponse;
import com.example.demo.Responses.Response;
import com.example.demo.Responses.ResponseType;

public abstract class ResponseFactory<T> {

    public abstract Response getResponse(ResponseType responseType, String message, T data);

    public String getStatusMessage(ResponseType responseType, String messsage) {
        String statusMessage = "";
        switch (responseType) {
            case OK:
                statusMessage = "Data retrieved successfully";
                break;
            case ERROR:
                statusMessage = "Error, please make sure all the fields are filled correctly";
                break;
            case WARNING:
                statusMessage = "Warning, the details are as follows:";
                break;
            default:
                throw new IllegalArgumentException("Invalid response type");
        }

        return statusMessage + "\n" + messsage;
    }
}
