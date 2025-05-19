package Math.Measurements;

import java.util.Objects;

public class Feet {

    private final double feet;

    public Feet(double feet) {
        this.feet = feet;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Feet feet1)) return false;
        return Double.compare(feet, feet1.feet) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(feet);
    }

    public Inch convertToInch() {
        return new Inch(feet * 12);
    }
}
