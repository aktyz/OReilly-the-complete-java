package Section6;

public class CountDown {
    public static void main(String[] args) {
        if(args[0] == null || args[1] == null) {
            System.out.println("Provide two numbers as program arguments");
        } else {
            System.out.println("Counting down from " + args[0] + ":");
            countDownFrom(Integer.parseInt(args[0]));
            System.out.println("\nCounting up from " + args[0] + " to " + args[1] + ":");
            countUpTo(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }
    }
    // recursion method with implicit base case
    public static void countDownFrom(int num) {
        if(num >= 0) {
            System.out.println(num);
            countDownFrom(num - 1);
        }
    }

    public static void countUpTo(int from, int to) {
        if(to < from) {
            System.out.println("Provide start number that will be smaller than end number");
        } else if(to == from) {
            System.out.println("End of Count Up!");
        } else {
            if(from <= to) {
                System.out.println(from);
                countUpTo(from + 1, to);
            }
        }
    }
}
