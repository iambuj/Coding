import java.util.Scanner;

public class Recursion10 {
    public static int countDigits(int n) {
        if(n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        System.out.println(countDigits(sc.nextInt()));
    }
}
