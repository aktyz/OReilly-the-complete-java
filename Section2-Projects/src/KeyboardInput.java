//import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        String name;
        String city;
        int age;

        System.out.println("What's your name?");
        name = keyboard.nextLine(); // consumes the next line character

        System.out.println("What's your age?");
        age = keyboard.nextInt(); /* ignores the next line character,
        leaving it in the stream for the next command to pick it up */
        keyboard.nextLine();

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("age is " + age);
        System.out.println("city is " + city);

    }//end main
}