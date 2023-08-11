package com.example.demo.Responses;

public class Response<T> implements IResponse {
    private ResponseType responseType;
    private String message;
    private T data;

    public Response(ResponseType responseType, String message, T data) {
        this.responseType = responseType;
        this.message = message;
        this.data = data;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
