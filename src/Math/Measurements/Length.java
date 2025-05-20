package Math.Measurements;

import java.util.Objects;

public class Length {

    public static Length createMillimeter(double mm) throws InvalidMeasurementException {
        if(isNegative(mm)){
            throw new InvalidMeasurementException();
        }
        return new Length(mm);
    }

    private static boolean isNegative(double mm) {
        return mm < 0;
    }

    public static Length createFeet(double feet) throws InvalidMeasurementException {
        if(isNegative(feet)){
            throw new InvalidMeasurementException();
        }
        return new Length((feet * 600)/2);
    }

    public static Length createInch(double inches) throws InvalidMeasurementException {
        if(isNegative(inches)){
            throw new InvalidMeasurementException();
        }
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

    public static Length createCentimeter(double cm) throws InvalidMeasurementException {
        if(isNegative(cm)){
            throw new InvalidMeasurementException();
        }
        return new Length(cm * 10);
    }

    public Length add(Length length) throws InvalidMeasurementException {
        return new Length(mm + length.mm);
    }
}
