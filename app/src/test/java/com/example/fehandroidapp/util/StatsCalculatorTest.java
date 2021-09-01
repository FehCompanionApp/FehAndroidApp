package com.example.fehandroidapp.util;

import com.example.fehandroidapp.model.CombinedHero;
import com.example.fehandroidapp.service.HeroService;

import org.junit.Assert;
import org.junit.Test;

public class StatsCalculatorTest {

    @Test
    public void getStat() throws Exception {
        HeroService heroService = new HeroService();
        CombinedHero hero = heroService.getCombinedHero("Marth: Legacied Hero");
        System.out.println(hero.getHp());
        System.out.println(hero.getHpGrowth());

        int hp = StatsHelper.calcStat40(hero.getHp().get(1), hero.getHpGrowth());
        Assert.assertEquals(41, hp);

        int atk = StatsHelper.calcStat40(hero.getAtk().get(1), hero.getAtkGrowth());
        Assert.assertEquals(36, atk);

        int spd = StatsHelper.calcStat40(hero.getSpd().get(1), hero.getSpdGrowth());
        Assert.assertEquals(37, spd);

        int def = StatsHelper.calcStat40(hero.getDef().get(1), hero.getDefGrowth());
        Assert.assertEquals(32, def);

        int res = StatsHelper.calcStat40(hero.getRes().get(1), hero.getResGrowth());
        Assert.assertEquals(26, res);
    }
}
