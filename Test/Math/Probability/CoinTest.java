package Math.Probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void probabilityForTail() {
        assertEquals(0.5, Coin.probabilityForTail());
    }
}