import java.util.*;

// Fibonacci series ----------


public class Fibonacci {
    public static void Fibo(int n) {
        int f1 = 0, f2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(f1 + " ");

            // Swap
            int f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
        }
    }
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        Fibo(num);
    }
}