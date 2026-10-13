
import java.util.Scanner;

public class Recursion11{
    public static int power(int base, int exp) {
        if(exp == 0){
            return 1;
        }
        return base * power(base, exp-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int base = sc.nextInt();
        System.out.print("Enter the power : ");
        int exp = sc.nextInt();
        if(base == 0 && exp == 0) {
            System.out.print( "Result = " + 0 + " , Beacuse 0^0 is undefined");
        }
        else{
            System.out.println("Result = " + power(base, exp));
        }
    }
}