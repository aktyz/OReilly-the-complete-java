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
            balance += amount;
        }
        else {
            System.out.println("Amount to deposit must be greater than 0");
        }
    }

    public void withdraw(int amount) {
        if(amount > 0 && amount <= balance) {
                this.balance -= amount;
                System.out.println("Remaining balance: " + balance);
        }
        else {
            System.out.println("The amount to withdraw must be greater than 0 " +
                    "and less than your balance which is " + balance);
        }
    }

    public void printBankAccountInfo() {
        System.out.println("Bank Account owner is: " + owner);
        System.out.println("Bank Account balance is: " + balance);
        System.out.println();
    }
}
