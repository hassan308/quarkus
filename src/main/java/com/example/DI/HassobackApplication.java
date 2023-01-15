package com.example.DI;

import com.example.DI.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableWebMvc
public class HassobackApplication {


    public static void main(String[] args) {
        SpringApplication.run(HassobackApplication.class, args);


    }
}
