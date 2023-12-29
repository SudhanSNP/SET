package com.app.apihelper.requests;

import com.app.apihelper.apiclient.ApiClient;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class GetRequests extends ApiClient {

    public GetRequests(String baseUrl) {
        super(baseUrl);
    }

    public GetRequests WithRequest() {
        SetClientUrl();
        SetRequest();
        return this;
    }

    public GetRequests WithAcceptRequestHeader() {
        HttpRequest.accept(ContentType.JSON);
        return this;
    }

    public GetRequests WithRequestBody(Object modal)
    {
        HttpRequest.body(modal);
        return this;
    }

    public GetRequests WithQueryParam(String key, Object value) {
        HttpRequest.queryParams(key, value);
        return this;
    }

    public Response SendRequest(String url) {
        HttpResponse = RestAssured.request(Method.GET, url);
        return HttpResponse;
    }
}
