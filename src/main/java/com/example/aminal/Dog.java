package com.example.aminal;

import com.example.aminal.gemensama.Aminal;

public class Dog implements Aminal {
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String MakeSound() {
        return "Aow Aow";
    }
}
