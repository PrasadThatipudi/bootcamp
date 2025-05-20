package Math.Measurements;

import java.util.Objects;

public class Length {

    public static Length createMillimeter(double mm) throws InvalidMeasurementException {

        return Length.createLength(mm);
    }

    private static boolean isNegative(double number) {
        return number < 0;
    }

    public static Length createFeet(double feet) throws InvalidMeasurementException {
        return Length.createLength((feet * 600)/2);
    }

    public static Length createInch(double inches) throws InvalidMeasurementException {
        return Length.createLength((inches * 50) /2);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return Double.compare(value, length.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    private final double value;

    private Length(double mm) {
        this.value = mm;
    }

    public static Length createCentimeter(double cm) throws InvalidMeasurementException {
        return Length.createLength(cm * 10);
    }

    public Length add(Length length) throws InvalidMeasurementException {
        return Length.createLength(value + length.value);
    }

    private static Length createLength(double length) throws InvalidMeasurementException {
        if(isNegative(length)){
            throw new InvalidMeasurementException();
        }

        return new Length(length);
    }
}
