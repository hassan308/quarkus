package com.example.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private final Technologies techdetail;

    @Autowired
    public Customers(Technologies techdetail) {
        this.techdetail = techdetail;
    }

    public void display()
    {
        System.out.println("lol");
        techdetail.tech();

    }
}
