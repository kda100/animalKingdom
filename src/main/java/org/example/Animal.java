package org.example;

abstract public class Animal {

    final public String name;
    final public Gender gender;
    private boolean isSleeping = false;
    private boolean isAlive = true;



    public Animal(String name, Gender gender) {
        super();
        this.name = name;
        this.gender = gender;
    }

    public Animal(Gender gender) {
        this("Anoy", gender);
    }


    abstract public String eat();
    abstract public String breed();
    abstract public String breathe();

    final public String move() {
        return "The animal is moving";
    }

    final public String poop() {
        return "The animal is pooping";
    }

    final public void sleep() {
        isSleeping = true;
    }

    final public void wakeUp() {
        this.isSleeping = false;
    }

    final public void dies() {
        if(this.isAlive) {
            this.isAlive = false;
        }
    }

    final public String getName() {
        return this.name;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean getIsSleeping() {
        return isSleeping;
    }

    public boolean getIsAlive() {
        return isAlive;
    }
}
