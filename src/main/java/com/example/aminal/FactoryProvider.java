package com.example.aminal;

import com.example.aminal.gemensama.FactoryAminalOrColorFactory;

public class FactoryProvider {

    public static final int AminalFactory = 1;
    public static final int ColorFactory = 2;

    public static FactoryAminalOrColorFactory create(int i) {
        return switch (i) {
            case AminalFactory -> new AminalAminalFactoryAminalOrColorFactory();
            case ColorFactory -> new ColorAminalFactoryAminalOrColorFactory();

            default -> throw new IllegalStateException("Unexpected value: " + i);
        };
    }
}
