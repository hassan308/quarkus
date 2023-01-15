package com.example.hassoback;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    @PhoneNumber
    private String phoneNumber;
}
