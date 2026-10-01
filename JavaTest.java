import java.util.Scanner;

class Bank {
    String nameOfDepositor;
    int accountno;
    double balance;

    public void initialize() {
        System.out.println("Depositor Name : " + nameOfDepositor);
        System.out.println("Balance        : " + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Amount : " + amount);
        System.out.println("New Balance      : " + balance);
    }

    void withdraw(double wid) {

        if (wid > balance) {
            System.out.println("Invalid Amount");
            System.out.println("Available Balance : " + balance);
        } else {
            balance -= wid;

            System.out.println("Withdrawn Amount : " + wid);
            System.out.println("New Balance      : " + balance);
        }
    }
}

public class JavaTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        System.out.print("Enter depositor name : ");
        b.nameOfDepositor = sc.nextLine();

        

        System.out.print("Enter initial balance : ");
        b.balance = sc.nextDouble();

        b.initialize();

        System.out.print("\nEnter amount to deposit : ");
        b.deposit(sc.nextDouble());

        System.out.print("\nEnter amount to withdraw : ");
        b.withdraw(sc.nextDouble());

        System.out.println("FINAL ACCOUNT DETAILS");
        System.out.println("Depositor Name : " + b.nameOfDepositor);
        System.out.println("Final Balance  : " + b.balance);

        sc.close();
    }
}