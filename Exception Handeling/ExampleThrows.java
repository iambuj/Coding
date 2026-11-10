
import java.util.Scanner;

public class ExampleThrows {
    static void vote(int age) throws ArithmeticException{
        if(age < 18) {
            throw new ArithmeticException("Minor...");
        }
        System.out.println("Eligible for voting...");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            vote(age);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}