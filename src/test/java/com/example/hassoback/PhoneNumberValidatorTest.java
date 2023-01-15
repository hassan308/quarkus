package com.example.hassoback;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PhoneNumberValidatorTest {

    @Test
    public void phoneNumberValidatorTest() {

        Person person = new Person();

        person.setPhoneNumber("123-456-7890");
        assertFalse(PhoneNumberValidator.isValid(person));
    }
}
