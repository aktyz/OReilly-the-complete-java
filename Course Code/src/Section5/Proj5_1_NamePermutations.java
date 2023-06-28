package Section5;

import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_NAMES = 5;
        StringBuilder userName;
        String[] names = new String[NUM_NAMES];
        String[] familyNames = new String[NUM_NAMES];

        /* Collect user input and split into two different arrays*/
        for (int i = 0; i < NUM_NAMES; i++) {
            System.out.println("Please enter name " + i + "\t");
            userName = new StringBuilder(scanner.nextLine());
            int spaceIndex = userName.indexOf(" ");
            names[i] = userName.substring(0, spaceIndex);
            familyNames[i] = userName.substring(spaceIndex + 1);
        }

        /* Output NamePermutations */
        for(String name : names) {
            for(String familyName : familyNames) {
                System.out.println(name + " " + familyName);
            }
        }
    }
}
