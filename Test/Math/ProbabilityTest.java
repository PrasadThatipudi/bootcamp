package Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void forTail() {
        assertEquals(Probability.init(0.5), Probability.init(0.5));
    }

    @Test
    void greaterThanOne() {
        IllegalArgumentException runtimeException = assertThrows(IllegalArgumentException.class, () -> {
            Probability.init(2);
        });

        assertEquals("Incorrect Probability: 2.0", runtimeException.getMessage());
    }

    @Test
    void lessThanOne() {
        IllegalArgumentException runtimeException = assertThrows(IllegalArgumentException.class, () -> {
            Probability.init(-1);
        });

        assertEquals("Incorrect Probability: -1.0", runtimeException.getMessage());
    }

    @Test
    void complimentOfTail() {
        Probability p1 = Probability.init(0.5);
        Probability p2 = Probability.init(0.5);

        assertEquals(p1,p2.complement());
    }

    @Test
    void complimentOfTail1() {
        Probability p1 = Probability.init(0.7);
        Probability p2 = Probability.init(0.7);

        assertEquals(p1.complement(),p2.complement());
    }

    @Test
    void forTwoTails() {
        Probability p1 = Probability.init(0.5);
        assertEquals(Probability.init(0.25),p1.and(p1));
    }

    @Test
    void atLeastOne() {
        Probability p1 = Probability.init(0.75);
        Probability p2 = Probability.init(0.5);

        assertEquals(p1,p2.or(p2));
    }
}