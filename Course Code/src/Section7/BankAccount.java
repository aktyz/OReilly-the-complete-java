package Section7;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        if(balance > 0)
            this.balance = balance;
        else {
            System.out.println("You need to provide some money to open the account");
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        if(amount > 0) {
            this.balance = this.balance + amount;
        }
        else {
            System.out.println("You need to provide some money to deposit");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0) {
            if(amount < this.balance) {
                this.balance = this.balance - amount;
                System.out.println("Collect your money");
                System.out.println("Remaining balance: " + this.balance);
            }
            else {
                System.out.println("Your balance is not sufficient for the withdraw");
            }
        }
        else {
            System.out.println("You need to provide a positive amount of money to withdraw");
        }
    }
}
