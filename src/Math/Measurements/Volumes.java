package Math.Measurements;

import java.util.Objects;

public class Volumes {

    private final double liters;

    public static Volumes createGallon(double gallons) {
        return new Volumes(gallons * 3.78);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volumes that)) return false;
        return Double.compare(liters, that.liters) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(liters);
    }

    public Volumes(double liters) {
        this.liters = liters;
    }

    public static Volumes createLiter(double liters) {
        return new Volumes(liters);
    }
}
