package com.app.apihelper.apiclient;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiClient implements IApiClient{
    protected String BaseUrl;
    public RequestSpecification HttpRequest;
    public Response HttpResponse;

    public ApiClient(String baseUrl) {
        BaseUrl = baseUrl;
    }

    @Override
    public void SetClientUrl() {
        RestAssured.baseURI = BaseUrl;
        RestAssured.useRelaxedHTTPSValidation();
    }

    @Override
    public void SetRequest() {
        HttpRequest = RestAssured.given();
    }
}
