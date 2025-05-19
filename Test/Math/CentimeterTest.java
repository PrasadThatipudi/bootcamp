package Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void initiateCentimeter() {
        Centimeter centimeter = new Centimeter(10);

        assertEquals(new Centimeter(10), centimeter);
    }
}