package Math.Measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MillimeterTest {
    @Test
    void initiateMm() {
        Millimeter millimeter = new Millimeter(10);

        assertEquals(new Millimeter(10),millimeter);
    }
}