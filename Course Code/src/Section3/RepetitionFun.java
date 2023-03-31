package Section3;

import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;

        // priming read
        System.out.println("Enter a non-negative integer");
        System.out.println("Or negative to exit");
        input = keyboard.nextInt();
        /* sentinel control loop */
        while(input >= 0) {
            System.out.println(input);
            System.out.println("Enter a non-negative integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
        }
        System.out.println("Done!");

        int count = 0;
        int count2 = 0;

        while (count <= 10) { /* loop continutation condition */
            System.out.println(count);
            count++;
        }

        do {
            System.out.println(count2);
            count2++;
        } while (count2<10);
        /* counter control loop */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}
