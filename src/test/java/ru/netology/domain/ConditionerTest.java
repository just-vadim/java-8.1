package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        assertEquals(40, conditioner.getMaxTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(1, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        assertEquals(40, conditioner.getMaxTemperature());
        conditioner.setCurrentTemperature(40);
        assertEquals(40, conditioner.getCurrentTemperature());
        conditioner.increaseCurrentTemperature();
        assertEquals(40, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        assertEquals(30, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(10);
        assertEquals(10, conditioner.getMinTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        assertEquals(30, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(10);
        assertEquals(10, conditioner.getMinTemperature());
        conditioner.setCurrentTemperature(10);
        assertEquals(10, conditioner.getCurrentTemperature());
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
    }
}