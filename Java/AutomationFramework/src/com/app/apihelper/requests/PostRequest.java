package com.app.apihelper.requests;

import com.app.apihelper.JsonHelper.JsonConvertor;
import com.app.apihelper.apiclient.ApiClient;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class PostRequest extends ApiClient {

    public PostRequest(String baseUrl) {
        super(baseUrl);
    }

    public PostRequest WithRequest() {
        SetClientUrl();
        SetRequest();
        return this;
    }

    public PostRequest WithRequestHeader(String key, String value) {
        HttpRequest.header(key, value);
        return this;
    }

    public PostRequest WithAcceptRequestHeader() {
        HttpRequest.accept(ContentType.JSON);
        return this;
    }

    public PostRequest WithContentTypeRequestHeader() {
        HttpRequest.contentType(ContentType.JSON);
        return this;
    }

    public PostRequest WithRequestBody(Object modal)
    {
        HttpRequest.body(JsonConvertor.JsonSerialize(modal));
        return this;
    }

    public PostRequest WithQueryParam(String key, Object value) {
        HttpRequest.queryParams(key, value);
        return this;
    }

    public Response SendRequest(String url) {
        HttpResponse = RestAssured.request(Method.POST, url);
        return HttpResponse;
    }
}
