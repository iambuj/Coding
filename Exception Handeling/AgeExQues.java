
import java.util.Scanner;

public class AgeExQues {
        static void checkAge(int age) throws ArithmeticException {
            if (age < 18) {
                throw new ArithmeticException("Not eligible");
            }
            System.out.println("Eligible");
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            try {
                checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }   
}