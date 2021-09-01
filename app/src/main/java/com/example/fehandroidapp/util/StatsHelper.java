package com.example.fehandroidapp.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StatsHelper {

    public static int calcStat40(int stat, double growth) {
        int g = (int) (growth * 100);
        double totGrowth = BigDecimal.valueOf(g * 1.14)
                .setScale(3, RoundingMode.HALF_UP)
                .doubleValue();
        int intTotG = (int) totGrowth;
        intTotG = (39 * intTotG / 100);
        return stat + intTotG;
    }
}
