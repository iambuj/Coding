import java.util.Scanner;

public class Recursion9 {
    public static int digitSum(int n) {
        if(n == 0) {
            return 0;
        }
        return (n%10) + digitSum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Enter a non negative number... ");
        }
        else{
            System.out.println("Sum of digits = " + digitSum(n));
        }
    }
}
