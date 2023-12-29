package com.app.apihelper.requests.users;

import com.app.apihelper.requests.PostRequest;
import io.restassured.response.Response;

public class PostUserRequests extends PostRequest {
    public PostUserRequests(String baseUrl) {
        super(baseUrl);
    }

    public Response PostUsersListResponse(Object user) {
        WithRequest()
            .WithRequestHeader("Content-Type", "application/json")
            .WithRequestBody(user)
            .SendRequest("users");
        return HttpResponse;
    }
}
