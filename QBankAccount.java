
import java.util.Scanner;

class BankAccount{
    String accountholder;
    int balance;

    public void deposite(int amount) {
        int newbalance = balance + amount;
        System.out.println("Account Holder name = " + this.accountholder);
        System.out.println("Your current balance " + this.balance);
        System.out.println("Your new Balance is = " + newbalance);
        
    }
}

public class QBankAccount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount b1 = new BankAccount();
        b1.accountholder = sc.nextLine();
        b1.balance = sc.nextInt();
        b1.deposite(sc.nextInt());
    }
}