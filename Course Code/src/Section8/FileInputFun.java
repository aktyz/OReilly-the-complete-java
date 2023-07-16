package Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        int sum = 0;
        // little helper to know current working directory
        System.out.println(System.getProperty("user.dir"));
        /* Walk through Java Exceptions tutorial
         * TODO: https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
         **/
        try {
            System.out.println();
            System.out.println("***-----------------------------------------------------***");
            System.out.println("Inside try body");
            System.out.println("***-----------------------------------------------------***");

            infile = new Scanner(new File("Course Code/src/Section8/input.txt"));
            //infile = new Scanner(new File("input.txt"));

            System.out.println(infile.nextLine());

            while(infile.hasNext()) {
                int number = infile.nextInt();
                sum += number;
                System.out.println(number);
            }

            infile.close();

        } catch(FileNotFoundException ex) { // replacing the default JAVA exception catch with our handling of JAVA exception
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        } catch(InputMismatchException ex) { // replacing the default JAVA exception catch with our handling of JAVA exception
            System.out.println("Error reading input!");
        }
        System.out.println();
        System.out.println("***-----------------------------------------------------***");
        System.out.println("Outside try body");
        System.out.println("***-----------------------------------------------------***");
        System.out.println("Sum of numbers is: " + sum);
    }
}
