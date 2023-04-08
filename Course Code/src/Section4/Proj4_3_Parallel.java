package Section4;

import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = new String[5];
        int[] ages = new int[5];

        for(int i = 0; i < names.length; i++) {
        System.out.print("Please provide a name:\t");
        names[i] = s.nextLine();

        System.out.print("Please provide age: \t");
        ages[i] = s.nextInt();
        s.nextLine();
        }

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " is " + ages[i] + " years old.");
        }
    }
}
