package com.example.abstractfactory;

public class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType factoryType)
    {
        switch (factoryType)
        {
            case LAPTOPFACTORY -> new DataFactory();
            case MOBILEFACTORY -> new MobileFactory();
        }
        return null;
    }
}
