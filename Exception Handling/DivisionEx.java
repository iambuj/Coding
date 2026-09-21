
import java.util.Scanner;

public class DivisionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.print("Enter the number : ");
        int b = sc.nextInt();
        
        try {
            int result = a/b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}