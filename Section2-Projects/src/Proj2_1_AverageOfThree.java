import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        double thirdNumber;

        System.out.println("Please enter three numbers");
        firstNumber = keyboard.nextDouble();
        secondNumber = keyboard.nextDouble();
        thirdNumber = keyboard.nextDouble();
        keyboard.nextLine(); //good habit to get into

        System.out.println("The mean of your numbers is " + (firstNumber + secondNumber + thirdNumber)/3.0);
    }
}
