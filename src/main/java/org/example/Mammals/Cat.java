package org.example.Mammals;

import org.example.Birds.Bird;
import org.example.Gender;
import org.example.Mammals.Mammal;

public class Cat extends Mammal {

    private int killCount = 0;
    public Cat(String name, Gender gender) {
        super(name, gender, 4);
    }

    public Cat(Gender gender) {
        super(gender, 4);
    }

    public void kill(Bird bird) {
        bird.dies();
        killCount++;
    }

    @Override
    public String eat() {
        return "The cat is eating cat food";
    }

    public int getKillCount() {
        return killCount;
    }
}
