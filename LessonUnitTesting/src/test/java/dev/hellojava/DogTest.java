package dev.hellojava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getName() {
       Dog dog = new Dog("Albert", 2);
       assertEquals("Albert", dog.getName());
    }

    @Test
    void setName() {
        Dog dog = new Dog("Albert", 2);
        dog.setName("Roman");
        assertEquals("Albert",dog.getName());
    }
    @Test
    void setNameTestIfEmpty() {
        Dog dog = new Dog("", 2);
        dog.setName("Roman");
        assertEquals("Roman",dog.getName());
    }
    @Test
    void getAge() {
        Dog dog = new Dog("Albert", 2);
        dog.getAge(2);
        assertEquals(2,dog.getAge(2));
    }

    @Test
    void setAge() {
    }
}