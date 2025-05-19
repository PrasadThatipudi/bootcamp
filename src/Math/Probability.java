package Math;

import java.util.Objects;

public class Probability {
    private final double chance;

    public Probability(double chance) {
        this.chance = chance;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability that)) return false;
        return Double.compare(chance, that.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }

    public static Probability init(double chance) {
        if(chance > 1 || chance < 0){
            throw new IllegalArgumentException("Incorrect Probability: " + chance);
        }

        return new Probability(chance);
    }

    public Probability complement() {
        return Probability.init(1 - chance);
    }


    public Probability and(Probability p1) {
        return Probability.init(chance * p1.chance);
    }

    @Override
    public String toString() {
        return "Probability{" +
                "chance=" + chance +
                '}';
    }

    public Probability or(Probability p2) {
        return and(p2).complement();
    }
}
