package com.app.apihelper.requests.users;

import com.app.apihelper.requests.GetRequests;
import io.restassured.response.Response;

public class GetUserRequests extends GetRequests {

    public GetUserRequests(String baseUrl) {
        super(baseUrl);
    }

    public Response GetUsersListResponse() {
        WithRequest()
            .WithAcceptRequestHeader()
            .WithQueryParam("page", 1)
            .SendRequest("users");
        return HttpResponse;
    }
}
