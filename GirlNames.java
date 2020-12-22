package com.lab03.fairytale.person;

import java.util.Random;

public enum GirlNames {
    ELENA("Елена"),
    KATYA("Катя"),
    VIKA("Вика"),
    ALINA("Алина"),
    LILYA("Лиля"),
    ALISA("Алиса"),
    TATYANA("Татьяна"),
    POLINA("Полина"),
    IRINA("Ирина"),
    ELIZAVETA("Елизавета"),
    ANASTASIA("Анастасия");

    public final String label;

    public static GirlNames getRandomName() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    private GirlNames(String label){
        this.label = label;
    }
}
