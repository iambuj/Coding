
import java.util.Scanner;

public class CalculatorThrows {
    static void calc(int a , int b) throws ArithmeticException{
        if(b == 0) {
            throw new ArithmeticException("B can not be = 0");
        }
        System.out.println("Division = " + (a/b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.print("Enter the number : ");
        int b = sc.nextInt();
        try {
            calc(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
