package org.example.Birds;

import org.example.Gender;

public class Penguin extends Bird {
    public Penguin(String name, Gender gender, double beakLength ) {
        super(name, gender, beakLength);
    }

    public Penguin(Gender gender, double beakLength) {
        super(gender, beakLength);
    }

    @Override
    public String eat() {
        return "The penguin is eating fish through its mouth";
    }
}
