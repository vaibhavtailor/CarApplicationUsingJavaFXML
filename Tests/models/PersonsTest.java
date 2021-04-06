package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonsTest {

    private Persons person;

    @BeforeEach
    void setUp() {
        person = new Persons("Jeff", "Brown", "testemail@gamil.com", "1 Bedrock lane", "9872341456");
    }

    @Test
    void setFirstName() {
        assertEquals("Jeff", person.getFirstName());
    }

    @Test
    void setLastName() {
        assertEquals("Brown", person.getLastName());
    }

    @Test
    void setEmail() {
        assertEquals("testemail@gamil.com", person.getEmail());
    }

    @Test
    void setAddress() {
        assertEquals("1 Bedrock lane", person.getAddress());
    }

    @Test
    void setContactNumber() {
        assertEquals("9872341456", person.getContactNumber());
    }
}