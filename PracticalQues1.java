import java.util.Scanner;

class Account{
    static String bank;
    long accountno;
    int balance;
}

class SavingAccount extends Account{

    void Deposite(int deposite) {
        balance += deposite;
    }
    void Withdraw(int amount){
        if(amount > balance) {
            System.out.println("Insufficient Balance...");
        }
        else{
            balance -= amount;
        }
    }
    void Display() {
        System.out.println("Bank : " + bank);
        System.out.println("Account number : " + accountno);
        System.out.println("Balance = " + balance);
    }
}

public class PracticalQues1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount account1 = new SavingAccount();
        System.out.print("Enter the bank name : ");
        Account.bank = sc.next();
        System.out.print("Enter the account number : ");
        account1.accountno = sc.nextLong();
        System.out.print("Enter the balance : ");
        account1.balance = sc.nextInt();
        System.out.print("Enter the Deposite amount : ");
        account1.Deposite(sc.nextInt());
        System.out.print("Enter the Withdrawl amount : ");
        account1.Withdraw(sc.nextInt());
        account1.Display();

        SavingAccount account2 = new SavingAccount();
        System.out.print("Enter the account number : ");
        account2.accountno = sc.nextLong();
        System.out.print("Enter the balance : ");
        account2.balance = sc.nextInt();
        System.out.print("Enter the Deposite amount : ");
        account2.Deposite(sc.nextInt());
        System.out.print("Enter the Withdrawl amount : ");
        account2.Withdraw(sc.nextInt());
        account2.Display();
    }
}
