package Section3;

import java.util.Scanner;

public class SumFun {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int integerSum = 0;
        int userInput;

        // priming read
        System.out.println("Enter a non-negative to add to sum");
        System.out.println("Or enter a negative to exit");
        userInput = keyboard.nextInt();
        /* sentinel control loop */
        while(userInput >= 0) {
            System.out.print("Your sum is:\t");
            integerSum += userInput;
            System.out.println(integerSum);
            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit");
            userInput = keyboard.nextInt();
        }
        System.out.println("Your final sum is: " + integerSum);
        System.out.println("Done!");

    }
}
