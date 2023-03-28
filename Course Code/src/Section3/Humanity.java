package Section3;

import java.util.Scanner;

public class Humanity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;

        System.out.print("Enter your gender:\t");
        gender = keyboard.next().charAt(0);

        System.out.print("Enter your age:\t");
        age = keyboard.nextInt();
        keyboard.nextLine();

        if (age >= 19 && gender == 'M') {
            System.out.println("You can join the fraternity");
        } else {
            System.out.println("Sorry, you doesn't count, you cannot join the fraternity");
        }
    }
}
