package Math.Measurements;

import java.util.Objects;

public class Volume {

    private final double liters;
    
    public Volume(double liters) {
        this.liters = liters;
    }

    public static Volume createGallon(double gallons) throws InvalidMeasurementException {
        if(isNegative(gallons)) {
            throw new InvalidMeasurementException();
        }
        return new Volume(gallons * 3.78);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume that)) return false;
        return Double.compare(liters, that.liters) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(liters);
    }

    public static Volume createLiter(double liters) throws InvalidMeasurementException {
        if(isNegative(liters)){
            throw new InvalidMeasurementException();
        }
        return new Volume(liters);
    }

    private static boolean isNegative(double liters) {
        return liters < 0;
    }
}
