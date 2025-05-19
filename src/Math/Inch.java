package Math;

import java.util.Objects;

public class Inch {
    private final double inches;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Inch inch)) return false;
        return Double.compare(inches, inch.inches) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inches);
    }

    public Inch(double inches) {
        this.inches = inches;
    }

    public Centimeter convertToCm() {
        return new Centimeter((5 * inches)/2);
    }
}
