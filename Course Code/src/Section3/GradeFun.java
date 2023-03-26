package Section3;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char grade;

        System.out.println("Enter a grade:");
        grade = keyboard.next().charAt(0);

        switch(grade) {
            case 'A':
                System.out.println("Great job!");
                break;
            case 'B':
                System.out.println("Good job.");
                break;
            case 'C':
                System.out.println("You can do better.");
                break;
            case 'D':
                System.out.println("You're getting pretty close to failing");
                break;
            case 'F':
                System.out.println("You are failing the course!");
                break;
            default:
                System.out.println("You have entered an invalid grade.");
        }
    }
}
