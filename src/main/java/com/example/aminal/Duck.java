package com.example.aminal;

import com.example.aminal.gemensama.Aminal;

public class Duck implements Aminal {

    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String MakeSound() {
        return "baq baq";
    }
}
