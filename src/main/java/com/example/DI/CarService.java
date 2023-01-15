package com.example.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class CarService {

    private final CarDao carDao;

    @Autowired
    public CarService(CarDao carDao)
    {
        this.carDao = carDao;
    }

    public String printa()
    {
       return carDao.print();
    }
}
