
import java.util.Scanner;

// leap year or not ??

public class Morefunc {
    public static String Leap(int a) {
        if(a % 4 == 0) {
            return "Leap Year";
        }
        else{
            return "No its not a leap year";
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int year = sc.nextInt();
        System.out.println(Leap(year));

    }
}

class Greatestn {
    public static String Largest(int a , int b , int c) {
        if(a > b && a > c) {
            return a + " Is the greatest";
        }
        else if(b > a && b > c) {
            return b + " Is the greatest";
        }
        else if(c > a && c > b) {
            return c + " Is the greatest";
        }
        else{
            return "ALL ARE EQUAL...";
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num3 = sc.nextInt();

        System.out.println(Largest(num1, num2, num3));
    }
}

class NumType{
    public static String Typeof(int a) {
        if(a < 0) {
            return "Negative number";
        }
        else if(a > 0) {
            return "Positive number";
        }
        else{
            return "Zero";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ënter the number : ");
        int n = sc.nextInt();
        System.out.println(Typeof(n));
    }
}

class Student{
    public static String Result(int a ) {
        if(a > 100) {
            return "Invalid marks";
        }
        else if(a >= 33) {
            return  "pass";
        }
        else{
            return "Fail";
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int marks = sc.nextInt();
        System.out.println(Result(marks));
    }
}

class Sumofn{
    public static int Sumn(int a) {
        int sum = 0;
        for(int i = 1; i <= a; i++ ) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(Sumn(num));
    }
}


class Facto{
    public static int Fac(int n ) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        System.out.println(Fac(a));
    }
}

class Tableofn{
    public static void Tab(int a) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + a + " = " + (i*a));
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        Tab(num);
    }
}

class Even{
    public static int CountEv(int a) {
        int count = 0;
        for(int i = 1; i <= a; i++) {
            if(i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(CountEv(n));
    }
}


class Oddsum{
    public static int Odds(int a) {
        int sum = 0;
        for(int i = 1; i <= a; i = i+2) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(Odds(n));
    }
}