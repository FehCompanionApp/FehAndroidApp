package com.example.fehandroidapp.service;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.fehandroidapp.BuildConfig;
import com.example.fehandroidapp.model.Weapon;
import com.example.fehandroidapp.util.ConnectionHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeaponsService {
    private final String URL = BuildConfig.URL;
    private final String INHERITABLE_WEAPONS = "/getInheritableWeapons";
    private final String GET_WEAPON_BY_NAME = "/getWeaponByName";
    
    @RequiresApi(api = Build.VERSION_CODES.O)
    public List<Weapon> getInheritableWeapons(String weaponType, String max)
            throws Exception {
        Map<String, String> requests = new HashMap<>();
        requests.put("max", max);
        requests.put("weaponType", weaponType);
        String json = ConnectionHelper.getConnection(URL + INHERITABLE_WEAPONS, requests);

        Gson gson = new Gson();
        Type type = new TypeToken<List<Weapon>>(){}.getType();
        List<Weapon> weapons = gson.fromJson(json, type);
        System.out.println("Returned "  + weapons.size());
        return weapons;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Weapon getWeapon(String name)
            throws Exception {
        Map<String, String> requests = new HashMap<>();
        requests.put("name", name);
        String json = ConnectionHelper.getConnection(URL + GET_WEAPON_BY_NAME, requests);

        Gson gson = new Gson();
        Type type = new TypeToken<Weapon>(){}.getType();
        Weapon weapon = gson.fromJson(json, type);
        System.out.println("Returned "  + weapon.getName());
        return weapon;
    }
}
