package Math.Measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumesTest {
    @Test
    void initiateLiter() {
        Volumes liter = Volumes.createLiter(10);

        assertEquals(Volumes.createLiter(10), liter);
    }

    @Test
    void initiateGallon() {
        Volumes gallon = Volumes.createGallon(10);

        assertEquals(Volumes.createGallon(10), gallon);
    }

    @Test
    void equalityBetweenLiterAndGallon() {
        Volumes gallon = Volumes.createGallon(1);
        Volumes liters = Volumes.createLiter(3.78);

        assertEquals(gallon, liters);
    }

    @Test
    void equalityBetweenGallonAndLiter() {
        Volumes gallon = Volumes.createGallon(1/3.78);
        Volumes liters = Volumes.createLiter(1);

        assertEquals(gallon, liters);
    }
}