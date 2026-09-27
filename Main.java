class BankAccount {
    private int balance;
    static int totalAccounts = 0;

    BankAccount(int balance) {
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(1000);
        BankAccount b2 = new BankAccount(2000);

        b1.deposit(500);
        b2.deposit(300);

        System.out.println("Account 1 balance = " + b1.getBalance());
        System.out.println("Account 2 balance = " + b2.getBalance());

        System.out.println("Total accounts = " + BankAccount.totalAccounts);
    }
}