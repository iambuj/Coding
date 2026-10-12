import java.util.Scanner;

public class Recursion6 {
    public static void Display(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        Display(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        Display(sc.nextInt());
    }
}
