package com.example.fehandroidapp.service;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.fehandroidapp.BuildConfig;
import com.example.fehandroidapp.model.Assist;
import com.example.fehandroidapp.util.ConnectionHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssistService {
    private final String URL = BuildConfig.URL;
    private final String INHERITABLE_ASSISTS = "/getInheritableAssists";
    private final String GET_ASSIST = "/getAssist";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public List<Assist> getInheritableAssists(String weaponType, String max)
            throws Exception {
        Map<String, String> requests = new HashMap<>();
        requests.put("max", max);
        requests.put("weaponType", weaponType);
        String json = ConnectionHelper.getConnection(URL + INHERITABLE_ASSISTS, requests);

        Gson gson = new Gson();
        Type type = new TypeToken<List<Assist>>(){}.getType();
        List<Assist> assists = gson.fromJson(json, type);
        System.out.println("Returned "  + assists.size());
        return assists;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Assist getAssist(String name)
            throws Exception {
        Map<String, String> requests = new HashMap<>();
        requests.put("name", name);
        String json = ConnectionHelper.getConnection(URL + GET_ASSIST, requests);

        Gson gson = new Gson();
        Type type = new TypeToken<Assist>(){}.getType();
        Assist assist = gson.fromJson(json, type);
        System.out.println("Returned "  + assist);
        return assist;
    }

}
