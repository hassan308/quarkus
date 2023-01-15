package com.example.constructor.lagra.hassoback;

public abstract class matTemplete {

    public String typeMat;
    int calorie;

    public matTemplete(String typeMat, int calorie) {
        this.typeMat = typeMat;
        this.calorie = calorie;
    }

    public void printa()
    {
        System.out.println("maten är " + this.typeMat + " kalorie är " + this.calorie);
    }
}
