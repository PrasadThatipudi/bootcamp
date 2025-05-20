package Math.Measurements;

import java.util.Objects;

public class Volume {

    private final double liters;

    public static Volume createGallon(double gallons) throws InvalidMeasurementException {
        if(gallons < 0) {
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

    public Volume(double liters) {
        this.liters = liters;
    }

    public static Volume createLiter(double liters) throws InvalidMeasurementException {
        if(liters < 0){
            throw new InvalidMeasurementException();
        }
        return new Volume(liters);
    }
}
