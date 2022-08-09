package org.example.tests;

import org.example.Birds.Bird;
import org.example.Birds.Penguin;
import org.example.Gender;
import org.example.Mammals.Cat;
import org.junit.jupiter.api.*;

public class CatTest {

    @Test
    public void test_get_cat_name() {
        final Cat cat = new Cat("Brian", Gender.MALE);
        Assertions.assertEquals(cat.getName(), "Brian");
    }

    @Test
    public void check_mammary_glands() {
        final Cat cat = new Cat("Felix", Gender.FEMALE);
        Assertions.assertEquals(cat.getMammaryGlandsNum(), 4);
    }

    @Test
    public void check_cats_kill_count() {
        final Cat cat = new Cat("Felix", Gender.FEMALE);
        final Bird bird = new Penguin("Louis", Gender.FEMALE, 10);
        Assertions.assertEquals(cat.getKillCount(), 0, "On initialisation kill count should be 0");
        cat.kill(bird);
        Assertions.assertEquals(bird.getIsAlive(), false, "The bird should be dead... isAlive = false");
        Assertions.assertEquals(cat.getKillCount(), 1, "cats kill count should increment by 1");
    }

}
