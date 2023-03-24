import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        double thirdNumber;

        System.out.println("What's your first real number?");
        firstNumber = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("What's your second real number?");
        secondNumber = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("What's your third real number?");
        thirdNumber = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("The mean of your numbers is " + (firstNumber + secondNumber + thirdNumber)/3);

    }
}
