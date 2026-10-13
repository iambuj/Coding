
import java.util.Scanner;

public class Recursion12 {
    public static void reverseNumber(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n % 10);
        reverseNumber(n / 10);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

                if(n < 0) {
            System.out.println("Enter a non-negative number");
        }
        else if(n == 0) {
            System.out.println("Reverse = 0");
        }
        else {
            System.out.print("Reverse = ");
            reverseNumber(n);
            System.out.println();
        }
    }
}
