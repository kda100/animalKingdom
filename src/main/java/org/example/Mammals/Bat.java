package org.example.Mammals;
import org.example.Fly;
import org.example.Gender;

public class Bat extends Mammal implements Fly {
    public Bat(String name, Gender gender) {
        super(name, gender, 2);
    }

    public Bat(Gender gender) {
        super(gender, 2);
    }

    @Override
    public String eat() {
        return "The bat is sucking blood";
    }

    @Override
    public String takeOff() {
        super.move();
        return "The bat is flapping its wings";
    }

    @Override
    public String flight() {
        super.move();
        return "The bat is gliding in the wind";
    }

    @Override
    public String landing() {
        super.move();
        return "The bat is coming down for a comfortable landing";
    }
}
