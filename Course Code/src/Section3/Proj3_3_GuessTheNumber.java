package Section3;

import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int userNumber;
        int numberOfGuesses = 1;
        int luckyNumber = r.nextInt(100) + 1;

        System.out.println("Guess your number from 1 to 100?");
        userNumber = s.nextInt();

        while (userNumber != luckyNumber) {
            if (userNumber > luckyNumber && userNumber <= 100) {
                System.out.println("Your guess is too high, try again");
            } else if (userNumber < luckyNumber && userNumber > 0){
                System.out.println("Your guess is too low, try again");
            } else {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100," +
                        "inclusive!");
            }
            numberOfGuesses++;
            userNumber = s.nextInt();
        }
        System.out.println("Congratulations! You guessed the number in " + numberOfGuesses +
                " guesses! Thanks for playing!");
    }
}
