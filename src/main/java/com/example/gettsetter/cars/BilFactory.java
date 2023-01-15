package com.example.gettsetter.cars;

public class BilFactory extends DeviceAbstrakt {

    private final String i;

    public BilFactory(String i) {
        this.i = i;
    }


    public Bil createFactory() {

        if (i.equals("audi")) {
            return new Audi();
        } else if (i.equals("Volvo")) {

            return new Volvo();
        }
        return null;
    }

    @Override
    public Bil hamtaDevice(DeviceTyper deviceTyper) {
        return switch (deviceTyper)
        {
            case IPHONE -> new Audi();
            case SAMSUNG -> new Volvo();
            default -> null;
        };
    }
}
