package com.example.food;

import com.example.food.gemensamma.FactoryMatEllerDricka;

public class FactoryOfFOOd {

    public static FactoryMatEllerDricka create(String s) {
        return switch (s) {
            case "dricka" -> new DrickaFactory();
            case "Mat" -> new FactoryMat();
            default -> throw new IllegalArgumentException("Invalid type: " + s);

        };
    }
}
