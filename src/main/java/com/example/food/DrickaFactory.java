package com.example.food;

import com.example.food.gemensamma.FactoryMatEllerDricka;
import com.example.food.gemensamma.matEllerDricka;

public class DrickaFactory extends FactoryMatEllerDricka {
    @Override
    public matEllerDricka hamta(String typ) {
        return switch (typ) {
            case "vatten" -> new Vatten();
            case "pepsi" -> new Pepsi();
            default -> throw new IllegalStateException("drickorna finsn ej");

        };

    }
}
