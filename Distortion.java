package com.lab03.fairytale;

import java.util.Random;

public enum Distortion {
    STRETCHED("растянута"),
    FLATTENED("сплющена"),
    SKEWED("перекошена");

    public final String label;

    public static Distortion getRandomDistortion() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    private Distortion(String label){
        this.label = label;
    }
}
