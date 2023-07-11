package Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;

        // little helper to evaluate current path
        File testFile = new File("");
        String currentPath = testFile.getAbsolutePath();
        System.out.println("current path is: " + currentPath);

        try {
            //infile = new Scanner(new File("Course Code/src/Section8/input.txt"));
            infile = new Scanner(new File("input.txt"));

            System.out.println(infile.nextLine());

            while(infile.hasNext()) {
                System.out.println(infile.nextInt());
            }

            infile.close();

        } catch(FileNotFoundException ex) {
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        } catch(InputMismatchException ex) {
            System.out.println("Error reading input!");
        } // replacing the default JAVA exception catch with our handling of JAVA exception
    }
}
