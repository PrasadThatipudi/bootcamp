package Math;

import java.util.Objects;

public class Centimeter {
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Centimeter that)) return false;
        return Double.compare(cm, that.cm) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cm);
    }

    private final double cm;

    public Centimeter(double cm) {
        this.cm = cm;
    }
}
