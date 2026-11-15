package Practice;

import java.util.Scanner;
class isFibonaaciNumber{
    public int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        for(int i = 2; i <= n; i++) {
            

            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}
public class PracticeQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isFibonaaciNumber fb = new isFibonaaciNumber();
        System.out.print("Enter the number : ");
        System.out.println(fb.fibonacci(sc.nextInt()));
        
    }
}
