import java.util.Scanner;

class Bank{
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;

        if(balance < 0) {
            System.out.println("Negative Balance...");
        }
        else{
            System.out.println("Your balance is " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}
public class EncapsulationBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        b.setBalance(sc.nextInt());
    }
}
