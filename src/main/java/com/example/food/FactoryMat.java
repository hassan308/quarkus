package com.example.food;

import com.example.food.gemensamma.FactoryMatEllerDricka;
import com.example.food.gemensamma.matEllerDricka;

public class FactoryMat extends FactoryMatEllerDricka {

    @Override
    public matEllerDricka hamta(String typ) {
        return switch (typ) {
            case "Kebeb" -> new Kebeb();
            case "Max" -> new Max();
            default -> throw new IllegalArgumentException("Invalid type: " + typ);

        };
    }
}
