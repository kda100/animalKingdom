package org.example.Mammals;

import org.example.Animal;
import org.example.Gender;

abstract public class Mammal extends Animal {
    final int mammaryGlandsNum;

    public Mammal(String name, Gender gender, int mammaryGlandsNum) {
        super(name, gender);
        if(gender == Gender.FEMALE) {
            this.mammaryGlandsNum = mammaryGlandsNum;
        } else {
            this.mammaryGlandsNum = 0;
        }
    }

    public Mammal(Gender gender, int mammaryGlandsNum) {
        super(gender);
        if(gender == Gender.FEMALE) {
            this.mammaryGlandsNum = mammaryGlandsNum;
        } else {
            this.mammaryGlandsNum = 0;
        }
    }


    @Override
    final public String breed() {
        return "The mammal is pregnant and then is giving birth";
    }

    @Override
    final public String breathe() {
        return "The mammal is breathing through its orifices";
    }

    public int getMammaryGlandsNum() {
        return mammaryGlandsNum;
    }
}
