package Section7;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double circumference() {
        return 2 * radius * Math.PI;
    }
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void printCircleInfo() {
        System.out.println("r = " + radius);
        System.out.println("C = " + String.format("%.2f", circumference()));
        System.out.println("A = " + String.format("%.2f", area()));
        System.out.println();
    }

    public String returnCircleInfo() {
        return ("r = " + radius + "\nC = " + String.format("%.2f", circumference()) + "\nA = " + String.format("%.2f", area()) + "\n\n");
    }
}
