package Section7;

import java.util.Scanner;

public class Proj7_1_BankAccountDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Who do create the account for?\t");
        String person = s.nextLine();
        System.out.print("What the initial amount of money?\t");
        BankAccount account1 = new BankAccount(person, s.nextInt());
        s.nextLine();
        System.out.print("What amount do you want to withdraw?\t");
        account1.withdraw(s.nextInt());
        s.nextLine();
    }
}
