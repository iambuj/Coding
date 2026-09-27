
import java.util.Scanner;

public class MockQues {
    static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is the greatest...");
            return a;
        }
        else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest...");
            return b;
        }
        else {
            System.out.println(c + " is the greatest...");
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        findLargest(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
}