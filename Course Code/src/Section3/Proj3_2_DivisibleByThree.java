package Section3;

import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userNumber;

        System.out.println("Provide a number:");
        userNumber = keyboard.nextInt();

        if(userNumber % 3 == 0) {
            System.out.println(userNumber + " is divisible by 3");
        } else {
            System.out.println(userNumber + " is NOT divisible by 3");
        }
    }
}
