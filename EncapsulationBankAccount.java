import java.util.Scanner;

class BankAccount {
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("balance = " + balance + "$");
    }

    public int getBalance() {
        return balance;
    }
}

public class EncapsulationBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount ba = new BankAccount();
        System.out.print("Enter your balnce = ");
        ba.setBalance(sc.nextInt());
    }
}
