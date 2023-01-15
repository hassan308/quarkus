package com.example.hassoback;

import java.util.HashMap;
import java.util.Map;

public enum test {
    Test("lol", "[%s - %s = %s]");

    private final String lol;
    private final Map<Long, String> functions = new HashMap<>();
    test(String lol, String... s) {
        this.lol = lol;
        addfunktion(s);
    }

    private void addfunktion(String ... funtions)
    {
        if(funtions != null)
        {
            for (String f : funtions)
            {
                this.functions.put(f.codePoints().filter(ch -> ch == '%').count(), f);
            }
        }
    }
}
