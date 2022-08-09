package org.example.Birds;

import org.example.Fly;
import org.example.Gender;
public class FlyingRat extends Bird implements Fly {
    public FlyingRat(String name, Gender gender, double beakLength) {
        super(name, gender, beakLength);
    }

    public FlyingRat(Gender gender, double beakLength) {
        super(gender, beakLength);
    }

    @Override
    public String eat() {
        return "The flying rat is eating bread through it's beak";
    }

    @Override
    public String takeOff() {
        super.move();
        return "The flying rat is flapping it's wings";
    }

    @Override
    public String flight() {
        super.move();
        return "The flying rat is gliding in the wind";
    }

    @Override
    public String landing() {
        super.move();
        return "The flying rat is coming down for a landing to annoy people";
    }
}
