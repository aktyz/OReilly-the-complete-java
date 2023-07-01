package Section6;

public class MethodCalls {
    public static void main(String[] args) {
        doSomething();
    }

    public static void doSomething() {
        System.out.println("In doSomething!");
        System.out.println("result: " + getSomeValue());
    }
    public static int getSomeValue() {
        return 150;
    }
}
