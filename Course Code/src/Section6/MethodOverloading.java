package Section6;

public class MethodOverloading {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5, 4);
        System.out.println(result);

        result = getResult(5,"12");
        System.out.println(result);

        System.out.println(getResult("I don't like", "this"));
    }
    public static int getResult(int num) {
        return num * 2;
    }
    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }
    public static int getResult(int num1, String value) {
        return num1 * Integer.parseInt(value);
    }
    public static String getResult(String s1, String s2) {
        return s1 + " " + s2;
    }
}
