package Section3;

public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age = 19;

        if (age >= 16) {
            System.out.println("You can drive in US");
        }
        else {
            System.out.println("You cannot drive in US yet");
        }

        for (int i = 1; i <= age; i++) {
            System.out.println("Happy Birthday " + i);
        }
    }
}
