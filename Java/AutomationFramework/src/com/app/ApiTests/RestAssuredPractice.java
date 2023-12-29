package com.app.ApiTests;

import com.app.apihelper.JsonHelper.JsonConvertor;
import com.app.apihelper.modal.users.UserList;
import com.app.apihelper.requests.users.GetUserRequests;
import com.app.helpers.properties.PropertiesReader;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;

public class RestAssuredPractice {

    public static void main(String[] args) throws JsonProcessingException {
        Response response = new GetUserRequests(GetProperty("baseUrl"))
                .GetUsersListResponse();
        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        UserList usersList = (UserList) JsonConvertor.JsonDeserialize(response.getBody().asString(), UserList.class);
        System.out.println(JsonConvertor.JsonSerialize(usersList.getData().get(1)));
    }

    protected static String GetProperty(String key) {
        String path = System.getProperty("user.dir") + "\\src\\com\\app\\ApiTests\\app.properties";
        PropertiesReader propertiesReader = new PropertiesReader(path);
        return propertiesReader.GetValue(key);
    }
}
