package com.example.abstractfactory;

public class HP extends Device {

    public String namn;
    public int year;


    public HP(String namn, int year) {
        this.namn = namn;
        this.year = year;
    }



    @Override
    public String toString() {
        return "HP{" +
                "namn='" + namn + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public String hamtaInformation() {
        return "modellen is " + this.namn + "year den kom ut is: " + this.year;
    }
}
