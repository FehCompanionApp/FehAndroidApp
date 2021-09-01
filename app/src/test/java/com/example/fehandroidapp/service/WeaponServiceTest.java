package com.example.fehandroidapp.service;

import com.example.fehandroidapp.model.Weapon;

import org.junit.Test;

import java.util.List;

public class WeaponServiceTest {

    @Test
    public void getInheritableWeaponsTest() throws Exception {
        WeaponsService weaponsService = new WeaponsService();
        List<Weapon> iWeapons = weaponsService.getInheritableWeapons("Red Tome", "true");
        System.out.println(iWeapons.get(0));
    }

    @Test
    public void getWeaponTest() throws Exception {
        WeaponsService weaponsService = new WeaponsService();
        Weapon weapon = weaponsService.getWeapon("Candelabra+");
        System.out.println(weapon);
    }

}
