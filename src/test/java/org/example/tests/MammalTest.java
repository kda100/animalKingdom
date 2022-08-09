package org.example.tests;

import org.example.Gender;
import org.example.Mammals.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MammalTest {
    @Test
    public void mammals_should_be_warm_blooded() {
        final Cat cat = new Cat("Felix", Gender.FEMALE);
        Assertions.assertEquals(cat.getWarmBlooded(), true, "Mammals are warm-blooded.");
    }
}
