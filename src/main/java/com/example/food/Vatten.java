package com.example.food;

import com.example.food.gemensamma.matEllerDricka;

public class Vatten extends matEllerDricka {

    public String namn;

    @Override
    public void print() {
        System.out.println("innehåller : " + this.namn);
    }

    @Override
    public void setVarde(String s) {
        this.namn = s;
    }
}
