package Section3;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userChosenPackage;
        int numberOfCoursesUserEnrolled;
        int numberOfCoursesIncludedInPackage;
        int baseCost;
        int pricePerAdditionalCourse;
        int totalCost = 0;

        System.out.println("Which package do you want: 1, 2 or 3?");
        userChosenPackage = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("How many courses have you enrolled this month?");
        numberOfCoursesUserEnrolled = keyboard.nextInt();
        keyboard.nextLine();
        // in switch statement set up the variables
        /* use if-else chain to avoid the error of uninitialized variable*/
        if(userChosenPackage == 1) {
            baseCost = 10;
            numberOfCoursesIncludedInPackage = 2;
            pricePerAdditionalCourse = 6;
        } else if (userChosenPackage == 2) {
            baseCost = 12;
            numberOfCoursesIncludedInPackage = 4;
            pricePerAdditionalCourse = 4;
        } else {
            baseCost = 15;
            numberOfCoursesIncludedInPackage = 6;
            pricePerAdditionalCourse = 3;
        }

            // in order not to repeat the calculation logic in each switch case
            if(numberOfCoursesUserEnrolled - numberOfCoursesIncludedInPackage > 0) {
                totalCost = baseCost + (numberOfCoursesUserEnrolled - numberOfCoursesIncludedInPackage) * pricePerAdditionalCourse;
            } else {
                totalCost = baseCost;
            }
            System.out.println("Your total cost is " + totalCost + "$");
        }
    }
