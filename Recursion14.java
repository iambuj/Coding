import java.util.Scanner;

public class Recursion14 {
    public static int Sum(int n ) {
        if(n == 0) {
            return 0;
        }
        return n + Sum(n-1);
    }
    // chacha aaj thak gya tha time nhi mila h isiliye college ke chakkar me
    // kal se start krdunga ----

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
