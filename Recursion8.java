import java.util.Scanner;
public class Recursion8 {
    public static int printFactorial(int n) {
        if(n == 1) {
            return 1;
        }

        return n * printFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        System.out.print("Factorial is = " + printFactorial(sc.nextInt()));
    }
}
