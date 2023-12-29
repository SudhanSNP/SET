package com.app.apihelper.apiclient;

import io.restassured.http.Method;

public class RequestTypeFactory {

    public Method GetRequestType(RequestMethod method) throws Exception {
        return switch(method) {
            case Get -> Method.GET;
            case Post -> Method.POST;
            case Put -> Method.PUT;
            case Delete -> Method.DELETE;
            default -> throw new Exception("Please provide valid Request type");
        };
    }
}
