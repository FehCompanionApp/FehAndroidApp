package com.example.fehandroidapp.service;

import com.example.fehandroidapp.model.CombinedHero;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;


public class HeroServiceTest {

    @Test
    public void getCombinedHeroTest() throws Exception {
        HeroService service = new HeroService();
        String fullName = "Marth: Legacied Hero";
        CombinedHero hero = service.getCombinedHero(fullName);
        System.out.println(hero.toString());
        assertEquals(hero.getFullName(), fullName);
    }

    @Test
    public void getAllHeroNamesTest() throws Exception {
        HeroService service = new HeroService();
        List<String> names = service.getAllHeroNames();
        System.out.print(names.get(0));
        assertNotNull(names);
    }
}
