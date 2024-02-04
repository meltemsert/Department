package com.java;

public class Male extends Staff {
    public Male(String name, String surname, String birthDate) {
        super(name, surname, birthDate);
    }

    @Override
    public int calculateOfRetirementAge() {
        return 65;
    }
}
