
import java.util.Scanner;

public class ExNew {
    static void num(int n) throws ArithmeticException{
        if(n < 0){
            throw new ArithmeticException("Number cannot be < 0");
        }
        System.out.println("Number = " + n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            num(n);
        } catch (ArithmeticException e) {
            System.out.println((e.getMessage()));
        }
    }
}
