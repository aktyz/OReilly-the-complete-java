public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isWarm = true;

        boolean combined = isRaining && isWarm;

        System.out.println("Is it raining and warm? " + (isRaining && isWarm));
        System.out.println("Is it raining or is it warm? " + (isRaining || isWarm));
        System.out.println("Is it NOT raining outside? " +(!isRaining));
    }
}
