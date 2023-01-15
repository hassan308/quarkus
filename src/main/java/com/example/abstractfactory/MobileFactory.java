package com.example.abstractfactory;

public class MobileFactory extends AbstractDeviceFactory {
    public MobileFactory()
    {

    }

    @Override
    public Device hamta(Devicetyp devicetyp) {
        return switch (devicetyp)
        {
            case SAMSUNG -> new Samsung("Samsung", 1990);
            case NOKIE -> new Nokia("Nokia", 1992);
            default -> null;
        };
    }
}
