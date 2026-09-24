
import java.util.Scanner;


public class BankAccountEx {
    static void Account(int Balance , int Withdraw) throws ArithmeticException{
        if(Withdraw > Balance) {
            throw new ArithmeticException("Insufficient funds ");
        }
        int newbalance = Balance-Withdraw;
        System.out.println(Withdraw + " Has been Withdrawal Successfully...");
        System.out.println("Your Current Balance is =  " + newbalance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Balance = sc.nextInt();
        int Withdraw = sc.nextInt();

        try {
            Account(Balance, Withdraw);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Thank You...");
        }
    }
}
