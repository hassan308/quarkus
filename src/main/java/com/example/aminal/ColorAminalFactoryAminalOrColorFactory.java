package com.example.aminal;

import com.example.aminal.gemensama.FactoryAminalOrColorFactory;
import com.example.aminal.gemensama.Color;

public class ColorAminalFactoryAminalOrColorFactory implements FactoryAminalOrColorFactory<Color> {

    @Override
    public Color create(String aminalType) {
        switch (aminalType)
        {
            case "Brown" -> new Brown();
            case "Red" -> new Red();

        }
        return null;
    }
}
