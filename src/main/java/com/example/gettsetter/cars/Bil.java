package com.example.gettsetter.cars;

public class Bil {

    public String namn;
    public String model;

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printa()
    {
        System.out.println("from tempelete bilen är :" + namn + " modelen är " + model);
    }
}

