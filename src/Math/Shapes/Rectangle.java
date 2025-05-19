package Math.Shapes;

public class Rectangle implements ClosedShape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public int area() {
        return width * height;
    }

    @Override
    public int perimeter() {
        return 2 * (width + height);
    }
}
