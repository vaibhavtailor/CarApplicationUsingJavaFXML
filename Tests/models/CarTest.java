package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car cars;

    @BeforeEach
    void setUp() {
        cars = new Car ("BMW", "540i", "White", "Gear", "Sedan", 55000, 4, 10.2);
    }

    @Test
    void setTransmission() {
        assertEquals("Gear", cars.getTransmission());
    }

    @Test
    void setCarType() {
        assertEquals("Sedan", cars.getCarType());
    }

    @Test
    void setSeats() {
        assertEquals(4, cars.getSeats());
    }
}