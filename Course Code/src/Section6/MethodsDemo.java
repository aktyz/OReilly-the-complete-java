package Section6;

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(7);
        int result = giveMe10();
        System.out.println("Result of function is " + result);
        result = addThese(8, 7);
        System.out.println("Result of function is " + result);
        double newResult = square(83.0980);
        System.out.println("Result of function is " + newResult);
    } // end main
    // void, parameterless method
    public static void printHello() {
        System.out.println("Hello there!");
    }
    // void, parameterized method
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    }
    // value-returning, parameterless method
    public static int giveMe10() {
        return 10;
    }
    // value-returning, parameterized method
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }
    // challenge: square of a double
    public static double square(double num) {
        return num * num;
    }
}
