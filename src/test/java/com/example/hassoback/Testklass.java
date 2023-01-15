package com.example.hassoback;

import com.example.DI.CarService;
import com.example.DI.Customers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Testklass {

    @Autowired
    Customers customers;

    @Test
    public void testPrinta() {
        customers.display();
    }
}

