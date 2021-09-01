package com.example.fehandroidapp.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonHelper {


    public static <T> T deserialize(String value, Class<T> returnType) {
        return (new Gson()).fromJson(value, returnType);
    }

    public static <T> String serialize(T type) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(type);
        jsonString = jsonString.replaceAll("true", "\"true\"");
        jsonString = jsonString.replaceAll("false", "\"false\"");
        System.out.println(jsonString);
        return jsonString;
    }
}
