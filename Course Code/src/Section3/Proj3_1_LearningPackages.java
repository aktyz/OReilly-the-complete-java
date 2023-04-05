package Section3;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userChosenPackage;
        int numberOfCoursesUserEnrolled;
        int totalCost = 0;

        System.out.println("Which package do you want: 1, 2 or 3?");
        userChosenPackage = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("How many courses have you enrolled this month?");
        numberOfCoursesUserEnrolled = keyboard.nextInt();
        keyboard.nextLine();

        switch(userChosenPackage) {
            case 1:
                if ((numberOfCoursesUserEnrolled - 2) > 0)
                    totalCost = 10 + 6 * numberOfCoursesUserEnrolled - 2;
                else totalCost = 10;
                break;
            case 2:
                if ((numberOfCoursesUserEnrolled - 4) > 0)
                    totalCost = 12 + 4 * (numberOfCoursesUserEnrolled - 4);
                else totalCost = 12;
                break;
            case 3:
                if ((numberOfCoursesUserEnrolled - 6) > 0)
                    totalCost = 15 + 3 * (numberOfCoursesUserEnrolled - 6);
                else totalCost = 15;
                break;
            default:
                System.out.println("Please provide valid numbers");
            }
            if(userChosenPackage > 0 && userChosenPackage < 4) {
                System.out.println("Your total cost is " + totalCost + "$");
            } else {
                System.out.println("You provided invalid numbers");
            }
        } // end of main

    } //end of class
