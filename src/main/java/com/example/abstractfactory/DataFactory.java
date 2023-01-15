package com.example.abstractfactory;

public class DataFactory extends AbstractDeviceFactory{

    private static DataFactory instance;

    public static DataFactory getInstance() {
        if (instance == null) {
            instance = new DataFactory();
        }
        return instance;
    }

    @Override
    public Device hamta(Devicetyp devicetyp) {
       if (devicetyp == Devicetyp.HP)
       {
           return new HP("HP", 2002);
       }
       return null;
    }
}
