package Section7;

public class Proj7_3_CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(12.75);

        circle1.printCircleInfo();
        circle2.printCircleInfo();
        circle3.printCircleInfo();
    }
}
