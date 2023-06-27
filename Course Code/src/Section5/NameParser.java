package Section5;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your first and last name:\n");
        String userInput = scanner.nextLine();

        int whereIsSpace = userInput.indexOf(" ");
        String firstName = userInput.substring(0, whereIsSpace);
        String lastName = userInput.substring(whereIsSpace + 1);

        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toLowerCase());
    }
}
