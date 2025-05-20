package Math.Measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void initiateCentimeter() {
        Length centimeter = Length.createCentimeter(10);

        assertEquals(Length.createCentimeter(10), centimeter);
    }

    @Test
    void initiateMillimeter() {
        Length millimeter = Length.createMillimeter(10);

        assertEquals(Length.createMillimeter(10), millimeter);
    }

    @Test
    void initiateFeet() {
        Length feet = Length.createFeet(10);

        assertEquals(Length.createFeet(10), feet);
    }

    @Test
    void initiateInch() {
        Length inch = Length.createInch(10);

        assertEquals(Length.createInch(10), inch);
    }
}