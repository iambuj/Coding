import java.util.Scanner;

public class Recursion5 {
    public static void evenNumbers(int n) {
        if(n == 0) {
            return;
        }

        evenNumbers(n - 1);
        if(n % 2 == 0) {
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        evenNumbers(sc.nextInt());
    }
}