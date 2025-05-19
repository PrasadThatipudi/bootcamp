package Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void initiateRectangle() {
        Rectangle rectangle = new Rectangle(10, 20);

        assertEquals("Rectangle{width=10, height=20}", rectangle.toString());
    }

    @Test
    void areaOfRectangle() {
        Rectangle rectangle = new Rectangle(10, 20);

        assertEquals(200, rectangle.area());
    }

    @Test
    void areaOfSquare() {
        Rectangle square = new Rectangle(10, 10);

        assertEquals(100, square.area());
    }

    @Test
    void perimeterOfRectangle() {
        Rectangle rectangle = new Rectangle(10, 20);

        assertEquals(60, rectangle.perimeter());
    }

    @Test
    void perimeterOfSquare() {
        Rectangle square = new Rectangle(10, 10);

        assertEquals(40, square.perimeter());
    }
}