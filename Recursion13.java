
import java.util.Scanner;

public class Recursion13 {
    public static int oddSum(int n){
        if(n == 0){
            return 0;
        }
        return (n % 2 != 0 ? n : 0) + oddSum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(oddSum(n));   
    }
}
