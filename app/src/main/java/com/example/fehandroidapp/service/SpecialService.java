package com.example.fehandroidapp.service;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.fehandroidapp.BuildConfig;
import com.example.fehandroidapp.model.Special;
import com.example.fehandroidapp.util.ConnectionHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpecialService {
    private final String URL = BuildConfig.URL;
    private final String INHERITABLE_SPECIALS = "/getInheritableSpecials";
    private final String GET_SPECIAL = "/getSpecial";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public List<Special> getInheritableSpecials(String weaponType, String max)
            throws Exception {
        Map<String, String> requests = new HashMap<>();
        requests.put("max", max);
        requests.put("weaponType", weaponType);
        String json = ConnectionHelper.getConnection(URL + INHERITABLE_SPECIALS, requests);

        Gson gson = new Gson();
        Type type = new TypeToken<List<Special>>(){}.getType();
        List<Special> specials = gson.fromJson(json, type);
        System.out.println("Returned "  + specials.size());
        return specials;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Special getSpecial(String name)
            throws Exception {
        Map<String, String> requests = new HashMap<>();
        requests.put("name", name);
        String json = ConnectionHelper.getConnection(URL + GET_SPECIAL, requests);

        Gson gson = new Gson();
        Type type = new TypeToken<Special>(){}.getType();
        Special special = gson.fromJson(json, type);
        System.out.println("Returned "  + special);
        return special;
    }
}
