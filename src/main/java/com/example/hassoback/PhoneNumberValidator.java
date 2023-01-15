package com.example.hassoback;


import java.lang.reflect.Field;

public class PhoneNumberValidator {
    public static boolean isValid(Person person) {
        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(PhoneNumber.class)) {
                field.setAccessible(true);
                try {
                    String phoneNumber = (String) field.get(person);
                    if (!isValidPhoneNumberFormat(phoneNumber)) {
                        return false;
                    }
                } catch (IllegalAccessException e) {
                }
            }
        }
        return true;
    }

    private static boolean isValidPhoneNumberFormat(String phoneNumber) {
        // Akceptabla formateringar: (123) 456-7890, 123-456-7890, 123.456.7890, 1234567890
        String pattern = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        return phoneNumber.matches(pattern);
    }



}
