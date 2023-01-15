package com.example.aminal;

import com.example.aminal.gemensama.FactoryAminalOrColorFactory;
import com.example.aminal.gemensama.Aminal;

public class AminalAminalFactoryAminalOrColorFactory implements FactoryAminalOrColorFactory<Aminal> {

    @Override
    public Aminal create(String AminalType) {
        switch (AminalType)
        {
            case "Dog" -> new Dog();
            case "Duck" -> new Duck();

        };
        return null;
    }
}
