package org.example;

abstract public class Animal {

    final public String name;
    final public Gender gender;
    final public Boolean isWarmBlooded;

    private boolean isSleeping = false;
    private boolean isAlive = true;

    public Animal(String name, Gender gender, boolean isWarmBlooded) {
        super();
        this.name = name;
        this.gender = gender;
        this.isWarmBlooded = isWarmBlooded;
    }

    public Animal(Gender gender, boolean isWarmBlooded) {
        this("Anoy", gender, isWarmBlooded);
    }


    abstract public String eat();
    public <T extends Animal> Animal breed(Animal partner ){
        Animal babyAnimal = null;
        try {
            babyAnimal = partner.getClass().getDeclaredConstructor().newInstance();
        }
        catch(Exception e){

        }
        finally {
            return babyAnimal;
        }
    }
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

    public Boolean getWarmBlooded() {
        return isWarmBlooded;
    }
}
