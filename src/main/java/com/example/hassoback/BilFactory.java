package com.example.hassoback;

public class BilFactory {
    public static final int Volvo = 1;
    public static final int Audi = 2;

    public BilTempelete bilCreate(int bil) {

        return switch (bil) {
            case Volvo -> new volvo();
            case Audi -> new Audi();
            default -> null;
        };
    }
}
