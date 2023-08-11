package com.example.demo.Responses;

public interface IResponse {
    ResponseType getResponseType();
    String getMessage();
    Object getData();
}
