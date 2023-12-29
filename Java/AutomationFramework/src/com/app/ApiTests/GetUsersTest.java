package com.app.ApiTests;

import com.app.apihelper.JsonHelper.JsonConvertor;
import com.app.apihelper.modal.users.UserList;
import com.app.apihelper.requests.users.GetUserRequests;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class GetUsersTest extends BaseApiTest {
    GetUserRequests userRequest;

    @BeforeMethod
    public void SetUp() {
        userRequest = new GetUserRequests(BaseUrl);
    }

    @Test
    public void GetUsers() {
        Response response = userRequest.GetUsersListResponse();
        UserList usersList = (UserList) JsonConvertor.JsonDeserialize(response.getBody().asString(), UserList.class);
        List<String> users = Arrays.asList("George", "Janet", "Emma", "Eve", "Charles", "Tracey");

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(usersList.getData().stream().map(user -> user.getFirst_name()).toList(), users);
        Assert.assertEquals(usersList.getData().size(), usersList.getPer_page());
    }
}
