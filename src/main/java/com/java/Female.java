package com.java;

public class Female extends Staff {
    public Female(String name, String surname, String birthDate) {

        super(name, surname, birthDate);
    }

    @Override
    public int calculateOfRetirementAge() {
        return 60;
    }
}
