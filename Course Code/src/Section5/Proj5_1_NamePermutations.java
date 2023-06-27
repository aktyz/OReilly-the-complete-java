package Section5;

import java.util.Scanner;

public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNames = new String[5];
        String[] names = new String[5];
        String[] familyNames = new String[5];
        /* Collect user input */
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter name " + i);
            userNames[i] = scanner.nextLine();
        }
        /* Create two arrays filled with user data */
        for(int i = 0; i < 5; i++) {
            int spaceIndex = userNames[i].indexOf(" ");
            names[i] = userNames[i].substring(0, spaceIndex);
            familyNames[i] = userNames[i].substring(spaceIndex + 1);
        }
        /* Output NamePermutations */
        for(String name : names) {
            for(String familyName : familyNames) {
                System.out.println(name + " " + familyName);
            }
        }
    }
}
