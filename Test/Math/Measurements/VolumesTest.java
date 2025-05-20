package Math.Measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumesTest {
    @Test
    void initiateLiter() throws InvalidMeasurementException {
        Volume liter = Volume.createLiter(10);

        assertEquals(Volume.createLiter(10), liter);
    }

    @Test
    void exceptionOnNegativeLiters() {
        assertThrows(InvalidMeasurementException.class, ()->{
            Volume.createLiter(-1);
        });
    }

    @Test
    void exceptionOnNegativeGallons() {
       assertThrows(InvalidMeasurementException.class, ()->{
           Volume.createGallon(-10);
       });
    }

    @Test
    void initiateGallon() throws Exception, InvalidMeasurementException {
        Volume gallon = Volume.createGallon(10);

        assertEquals(Volume.createGallon(10), gallon);
    }

    @Test
    void equalityBetweenLiterAndGallon() throws Exception, InvalidMeasurementException {
        Volume gallon = Volume.createGallon(1);
        Volume liters = Volume.createLiter(3.78);

        assertEquals(gallon, liters);
    }

    @Test
    void equalityBetweenGallonAndLiter() throws InvalidMeasurementException {
        Volume gallon = Volume.createGallon(1/3.78);
        Volume liters = Volume.createLiter(1);

        assertEquals(gallon, liters);
    }
}