package org.example.tests;
import org.example.Birds.Bird;
import org.example.Birds.FlyingRat;
import org.example.Birds.Penguin;
import org.example.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    public void test_sleep() {
        final Bird bird = new FlyingRat("Pigeon", Gender.MALE, 10);
        Assertions.assertEquals(bird.getIsSleeping(), false, "isSleeping is not initialised to be false");
        bird.sleep();
        Assertions.assertEquals(bird.getIsSleeping(), true, "sleep() function did not making isSleeping true");
    }

    @Test
    public void test_wake_up() {
        final Bird bird = new FlyingRat("Pigeon", Gender.MALE,10);
        bird.sleep();
        Assertions.assertEquals(bird.getIsSleeping(), true, "animal.sleep() function did not making isSleeping true");
        bird.wakeUp();
        Assertions.assertEquals(bird.getIsSleeping(), false, "animal.wakeUp() function did not make isSleeping false");
    }

    @Test
    public void test_die() {
        final Penguin penguin = new Penguin("Happy Feet", Gender.MALE, 10);
        Assertions.assertEquals(penguin.getIsAlive(), true, "isAlive is not initialised to be true");
        penguin.dies();
        Assertions.assertEquals(penguin.getIsAlive(), false, "animal.dies() does not change the isAlive to false");
    }
}
