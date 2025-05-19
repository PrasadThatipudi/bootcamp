package Math.Measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void initialiseFeet() {
        Feet feet = new Feet(12);

        assertEquals(new Feet(12), feet);
    }

    @Test
    void covertToInch() {
        Feet feet = new Feet(1);

        assertEquals(new Inch(12),feet.convertToInch());
    }

    @Test
    void covertToInchAnother() {
        Feet feet = new Feet(0.5);

        assertEquals(new Inch(6.0),feet.convertToInch());
    }
}