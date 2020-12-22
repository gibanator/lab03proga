package com.lab03.fairytale;

import java.util.AbstractMap;
import java.util.EnumMap;
import java.util.Random;

public enum Food {
    COFFEE("кофе"),
    TEA("чай"),
    SODA("газировку"),
    ICECREAM("мороженое"),
    SNACK("закуски"),
    DINNER("ужин");

    public final String label;

    public static Food getRandomFood() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    private Food(String label){
        this.label = label;
    }

}
