package Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void initiateInch() {
        Inch inch = new Inch(10);

        assertEquals(new Inch(10), inch);
    }

    @Test
    void convertToCm() {
        Inch inch = new Inch(2);

        assertEquals(new Centimeter(5), inch.convertToCm());
    }

    @Test
    void convertToCmAnother() {
        Inch inch = new Inch(4);

        assertEquals(new Centimeter(10), inch.convertToCm());
    }
}