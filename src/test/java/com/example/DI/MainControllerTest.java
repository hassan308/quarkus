package com.example.DI;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class MainControllerTest {


    @MockBean
    private CarService carService;
    @Autowired
    private MainController mainController;

    @Test
    public void print()
    {
        when(carService.printa()).thenReturn("hej");
        String printa = mainController.printa();
        verify(carService, times(1)).printa();
        System.out.println(printa);

    }
}