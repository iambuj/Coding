
import java.util.Scanner;

public class Recursion4 {
    public static int printFactorial(int n) {
        if( n == 1 || n == 0) {
            return 1;
        }

        int fac_num1 = printFactorial(n-1);
        int fact_1 = n * fac_num1;
        return fact_1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int ans = printFactorial(n);
        System.out.println(ans);
    }
}
