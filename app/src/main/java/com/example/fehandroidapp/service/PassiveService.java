package com.example.fehandroidapp.service;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.fehandroidapp.BuildConfig;
import com.example.fehandroidapp.model.Passive;
import com.example.fehandroidapp.util.ConnectionHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassiveService {
    private final String URL = BuildConfig.URL;
    private final String INHERITABLE_PASSIVES = "/getInheritablePassives";
    private final String GET_PASSIVE = "/getPassive";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public List<Passive> getInheritablePassives(String slot, String max, String movement, String weaponType)
            throws Exception {
        Map<String, String> requests = new HashMap<>();
        requests.put("slot", slot);
        requests.put("max", max);
        requests.put("movement", movement);
        requests.put("weaponType", weaponType);
        String json = ConnectionHelper.getConnection(URL + INHERITABLE_PASSIVES, requests);

        Gson gson = new Gson();
        Type type = new TypeToken<List<Passive>>(){}.getType();
        List<Passive> passives = gson.fromJson(json, type);
        System.out.println("Returned "  + passives.size());
        return passives;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Passive getPassive(String name) throws Exception {
        Map<String, String> body = new HashMap<>();
        body.put("name", name);
        String json = ConnectionHelper.getConnection(URL + GET_PASSIVE, body);

        Gson gson = new Gson();
        Type type = new TypeToken<Passive>() {
        }.getType();
        Passive passive = gson.fromJson(json, type);
        System.out.println("Returned " + passive);
        return passive;
    }
}
