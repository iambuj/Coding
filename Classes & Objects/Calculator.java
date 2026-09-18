import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a = z.nextInt();
        int b = z.nextInt();
        int sum = a + b;
        int diff = a-b;
        int prod = a*b;
        int div = a/b;


        System.out.print("Sum is = ");
        System.out.println(sum);
        System.out.print("diff is = ");
        System.out.println(diff);
        System.out.print("Product is = ");
        System.out.println(prod);
        System.out.print("Division is = ");
        System.out.println(div);
    }
}
