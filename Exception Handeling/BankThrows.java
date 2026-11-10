import java.util.Scanner;

public class BankThrows {
    static void withdraw(int amount) throws ArithmeticException{
        if (amount < 0) {
            throw new ArithmeticException("Invalid amount");
        }
        System.out.println(amount + " Withdrawls Successfully...");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        try{
            withdraw(amount);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }      
    }
}