
import java.util.Scanner;

public class AgeEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        try {
            if(age < 18) {
                throw new ArithmeticException();
            }
            else{
                System.out.println("Eligible");
            }
        } catch (ArithmeticException e) {
            System.out.println("Minor...");
        }
    }
}
