import java.util.*;

class Calculator {
    int a;
    int b;

    public void add() {
        int sum = a + b;
        System.out.println("The sum of numbers is = " + sum);
    }

    public void subtract() {
        int diff = a - b;
        System.out.println("The difference of numbers is = " + diff);
    }

    public void product() {
        int mul = a * b;
        System.out.println("The difference of numbers is = " + mul);
    }
}

public class QCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator c1 = new Calculator();

        c1.a = sc.nextInt();
        c1.b = sc.nextInt();

        c1.add();
        c1.subtract();
        c1.product();
    }
}