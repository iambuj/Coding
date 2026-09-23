
import java.util.Scanner;

public class AgeExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int age = sc.nextInt();

        try {
            if(age < 18) {
                throw new ArithmeticException();
            }
            else{
                System.out.println("Age = " + age);
            }
        } catch (ArithmeticException e) {
            System.out.println("Invalid age...");
        }
        finally{
            System.out.println("Code Ended...");
        }
    }
}