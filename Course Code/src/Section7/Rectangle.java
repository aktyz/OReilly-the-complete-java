package Section7;

public class Rectangle {
    private double length;
    private double width;

    /**
     * numRectangles is a static field:
     * it exists when even no objects of the Rectangle class exist
     * it is shared between all Rectangle objects when they do exist
     */
    private static int numRectangles;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numRectangles++;
    }

    public Rectangle() {
        this(1.0, 1.0);
    }

    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * length + 2 * width;
    }
    public static int getNumRectangles() {
        return numRectangles;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
