package com.example.fehandroidapp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.fehandroidapp.model.Assist;
import com.example.fehandroidapp.model.CombinedHero;
import com.example.fehandroidapp.model.Passive;
import com.example.fehandroidapp.model.Special;
import com.example.fehandroidapp.model.Weapon;
import com.example.fehandroidapp.service.AssistService;
import com.example.fehandroidapp.service.HeroService;
import com.example.fehandroidapp.service.PassiveService;
import com.example.fehandroidapp.service.SpecialService;
import com.example.fehandroidapp.service.WeaponsService;

import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getAllHeroInfo() throws Exception {
        HeroService heroService = new HeroService();
        AssistService assistService = new AssistService();
        PassiveService passiveService = new PassiveService();
        SpecialService specialService = new SpecialService();
        WeaponsService weaponsService = new WeaponsService();
        String max = "true";

        CombinedHero hero = heroService.getCombinedHero("Marth: Legacied Hero");

        List<Weapon> iWeapons = weaponsService.getInheritableWeapons(hero.getWeaponType(), max);
        List<Assist> iAssists = assistService.getInheritableAssists(hero.getWeaponType(), max);
        List<Special> iSpecial = specialService.getInheritableSpecials(hero.getWeaponType(), max);

        List<Passive> iA = passiveService.getInheritablePassives("A", max, hero.getMovement(), hero.getWeaponType());
        List<Passive> iB = passiveService.getInheritablePassives("B", max, hero.getMovement(), hero.getWeaponType());
        List<Passive> iC = passiveService.getInheritablePassives("C", max, hero.getMovement(), hero.getWeaponType());
        List<Passive> iSeal = passiveService.getInheritablePassives("Seal", max, hero.getMovement(), hero.getWeaponType());

        System.out.println(hero);
        System.out.println(iWeapons);
        System.out.println(iAssists);
        System.out.println(iSpecial);

        System.out.println(iA);
        System.out.println(iB);
        System.out.println(iC);
        System.out.println(iSeal);
    }
}