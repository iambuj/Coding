
import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter Your Age : ");
            int age = sc.nextInt();
            System.out.println(age );
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Input...");
        }
    }
}
