package Math.Measurements;

import java.util.Objects;

public class Length {

    public static Length createMillimeter(double mm) {
        return new Length(mm);
    }

    public static Length createFeet(double feet) {
        return new Length(feet * 600);
    }

    public static Length createInch(double inches) {
        return new Length((inches * 50) /2);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return Double.compare(mm, length.mm) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mm);
    }

    private final double mm;

    public Length(double mm) {
        this.mm = mm;
    }

    public static Length createCentimeter(double cm) {
        return new Length(cm * 10);
    }
}
