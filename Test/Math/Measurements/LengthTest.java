package Math.Measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void initiateCentimeter() throws InvalidMeasurementException {
        Length centimeter = Length.createCentimeter(10);

        assertEquals(Length.createCentimeter(10), centimeter);
    }

    @Test
    void exceptionOnNegativeCm() {
        assertThrows(InvalidMeasurementException.class, ()->{
            Length.createCentimeter(-10);
        });
    }

    @Test
    void initiateMillimeter() throws InvalidMeasurementException {
        Length millimeter = Length.createMillimeter(10);

        assertEquals(Length.createMillimeter(10), millimeter);
    }


    @Test
    void exceptionOnNegativeMm() {
        assertThrows(InvalidMeasurementException.class, ()->{
            Length.createMillimeter(-10);
        });
    }

    @Test
    void initiateFeet() throws InvalidMeasurementException {
        Length feet = Length.createFeet(10);

        assertEquals(Length.createFeet(10), feet);
    }


    @Test
    void exceptionOnNegativeInches() {
        assertThrows(InvalidMeasurementException.class, ()->{
            Length.createInch(-10);
        });
    }

    @Test
    void exceptionOnNegativeFeet() {
        assertThrows(InvalidMeasurementException.class, ()->{
            Length.createFeet(-10);
        });
    }

    @Test
    void initiateInch() throws InvalidMeasurementException {
        Length inch = Length.createInch(10);

        assertEquals(Length.createInch(10), inch);
    }

    @Test
    void compareWithFeetAndInch() throws InvalidMeasurementException {
        Length feet = Length.createFeet(1);
        Length inch = Length.createInch(12);

        assertEquals(feet, inch);
    }

    @Test
    void compareInchAndCm() throws InvalidMeasurementException {
        Length centimeter = Length.createCentimeter(5);
        Length inch = Length.createInch(2);

        assertEquals(inch, centimeter);
    }

    @Test
    void compareCmAndMm() throws InvalidMeasurementException {
        Length centimeter = Length.createCentimeter(1);
        Length millimeter = Length.createMillimeter(10);

        assertEquals(centimeter, millimeter);
    }

    @Test
    void addTwoSameInches() throws InvalidMeasurementException {
        Length inch = Length.createInch(2);

        assertEquals(Length.createInch(4), inch.add(inch));
    }

    @Test
    void addTwoDifferentInches() throws InvalidMeasurementException {
        Length inch1 = Length.createInch(2);
        Length inch2 = Length.createInch(3);

        assertEquals(Length.createInch(5), inch1.add(inch2));
    }

    @Test
    void addInchesAndCm() throws InvalidMeasurementException {
        Length inch = Length.createInch(2);
        Length centimeter = Length.createCentimeter(2.5);

        assertEquals(Length.createInch(3), inch.add(centimeter));
    }
}