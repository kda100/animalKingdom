package org.example.tests;

import org.example.Gender;
import org.example.Mammals.Cat;
import org.junit.jupiter.api.*;

public class CatTest {

    @Test
    public void test_get_cat_name() {
        final Cat cat = new Cat("Brian", Gender.MALE, 2);
        Assertions.assertEquals(cat.getName(), "Brian");
    }

}
