package com.app.apihelper.JsonHelper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConvertor {
    public static String JsonSerialize(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        String str = null;
        try {
            str = objectMapper
                    .writerWithDefaultPrettyPrinter()
                    .writeValueAsString(obj);
        }
        catch (JsonProcessingException exception) {
            exception.printStackTrace();
        }
        return str;
    }

    public static Object JsonDeserialize(String response, Class classType) {
        ObjectMapper objectMapper = new ObjectMapper();
        Object obj = null;
        try{
            obj = objectMapper
                    .readValue(response, classType);
        }
        catch (JsonProcessingException exception) {
            exception.printStackTrace();
        }
        return obj;
    }
}
