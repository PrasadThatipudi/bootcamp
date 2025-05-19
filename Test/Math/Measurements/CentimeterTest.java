package Math.Measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void initiateCentimeter() {
        Centimeter centimeter = new Centimeter(10);

        assertEquals(new Centimeter(10), centimeter);
    }

    @Test
    void convertToMm() {
        Centimeter centimeter = new Centimeter(1);

        assertEquals(new Millimeter(10), centimeter.toMillimeter());
    }

    @Test
    void convertToMmAnother() {
        Centimeter centimeter = new Centimeter(0.5);

        assertEquals(new Millimeter(5), centimeter.toMillimeter());
    }
}