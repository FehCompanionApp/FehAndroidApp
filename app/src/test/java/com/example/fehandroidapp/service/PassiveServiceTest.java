package com.example.fehandroidapp.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import com.example.fehandroidapp.model.Passive;

import org.junit.Test;

import java.util.List;

public class PassiveServiceTest {

    @Test
    public void getInheritablePassivesTest() {
        String slot = "A";
        String max = "true";
        String movement = "Infantry";
        String weaponType = "Red Tome";

        PassiveService service = new PassiveService();
        try {
            List<Passive> passives = service.getInheritablePassives(slot, max, movement, weaponType);
            System.out.println(passives.size());
            assertNotNull(passives);

        } catch (Exception e) {
            fail(e.getMessage());
        }

    }
}
