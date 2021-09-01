package com.example.fehandroidapp.service;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.fehandroidapp.model.CombinedHero;
import com.example.fehandroidapp.util.ConnectionHelper;
import com.example.fehandroidapp.util.JsonHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HeroService {
    private final String COMBINED_HERO_ENDPOINT = "http://localhost:8080/getCombinedHero";
    private final String HERO_NAMES_ENDPOINT = "http://localhost:8080/getAllHeroNames";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public CombinedHero getCombinedHero(String fullName) throws Exception {
        Map<String, String> requests = new HashMap<>();
        requests.put("fullName", fullName);
        String json = ConnectionHelper.getConnection(COMBINED_HERO_ENDPOINT, requests);
        System.out.println(json);
        return JsonHelper.deserialize(json, CombinedHero.class);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public List<String> getAllHeroNames() throws Exception {
        String json = ConnectionHelper.getConnection(HERO_NAMES_ENDPOINT, new HashMap<>());

        Gson gson = new Gson();
        Type type = new TypeToken<List<String>>(){}.getType();
        List<String> names = gson.fromJson(json, type);
        System.out.println("Returned "  + names.size());
        return names;
    }
}
