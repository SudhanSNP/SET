package com.app.ApiTests;

import com.app.apihelper.modal.users.User;
import com.app.apihelper.requests.users.PostUserRequests;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateUserTest extends BaseApiTest{
    PostUserRequests userRequest;

    @BeforeMethod
    public void SetUp() {
        userRequest = new PostUserRequests(BaseUrl);
    }

    @Test
    public void CreateUsers() {
        User user = new User();
        user.setName("Sudhan");
        user.setJob("Senior Software Engineer in Test");

        Response response = userRequest.PostUsersListResponse(user);

        Assert.assertEquals(response.getStatusCode(), 415);
    }
}
