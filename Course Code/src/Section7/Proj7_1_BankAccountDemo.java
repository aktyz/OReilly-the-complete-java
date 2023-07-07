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
        BankAccount account2 = new BankAccount("Bob Robinson");
        account2.deposit(7000);
        account1.printBankAccountInfo();
        account2.printBankAccountInfo();

        System.out.print(person + ", what amount do you want to withdraw?\t");
        account1.withdraw(s.nextInt());
        s.nextLine();

        System.out.println("Trying to withdraw more that Rob's has:");
        account2.withdraw(10000);
    }
}
