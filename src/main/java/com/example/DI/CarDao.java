package com.example.DI;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class CarDao {
    public CarDao() {

    }

    public String print()
    {
       return "from cardao";
    }
}
