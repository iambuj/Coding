import java.util.Scanner;

class Numbers{
    int numbers;
    int a;
    int b;
    int c;

    public void sum(int a , int b) {
        int res = a+b;
        System.out.println("The sum of two numbers = " + res);
    }

    public void sum(int a , int b , int c) {
        int res2 = a+b+c;
        System.out.println("The sum of three numbers = " + res2);
    }
}

public class PolySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Numbers n1 = new Numbers();
        n1.numbers = sc.nextInt();

        n1.a = sc.nextInt();
        n1.b = sc.nextInt();
        n1.c = sc.nextInt();
        n1.sum(n1.a, n1.b);
        n1.sum(n1.a, n1.b, n1.c);
    }
}
