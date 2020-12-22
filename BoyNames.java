package com.lab03.fairytale.person;

import java.util.Random;

public enum BoyNames {
    GEORGE("Георгий"),
    ANDREW("Андрей"),
    AHMAT("Ахмат"),
    KOLYA("Николай"),
    VLADIMIR("Владимир"),
    ARTEM("Артём"),
    RICHARD("Ричард"),
    JOSEPH("Иосиф"),
    PETR("Пётр"),
    GRIGORIY("Григорий"),
    MAKAR("Макар"),
    STEPAN("Степан"),
    VYACHESLAV("Вячеслав"),
    DMITRIY("Дмитрий");

    public final String label;

    public static BoyNames getRandomName() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    private BoyNames(String label){
        this.label = label;
    }
}
