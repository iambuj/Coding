import java.util.Scanner;

public class Methd {
    public static void PrintAbout(String a , int b) {
        System.out.println(a + " " + b);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        String name = sc.next();
        int age = sc.nextInt();

        PrintAbout(name , age);
    }
}

class Funtion {
    public static void PrintName(String username) {
        System.out.println(username);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");

        String namee = sc.next();
        if (namee.equals("Ambuj")) {
        PrintName("Welcome " + namee);
        }
        else{
            System.out.println("Enter Valid username...");
        }
    }
}

class Fnsum {
    public static int NumSum(int a , int b) {
        System.out.println("Sum is = " + (a + b));
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num2 = sc.nextInt();
        NumSum(num1, num2);

    }
}

class Product {
    public static int Mulnum(int a , int b) {
        int pro = a * b;
        return pro;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int n2 = sc.nextInt();

        int pro = Mulnum(n1, n2);
        System.out.println("The product of 2 numbers is = " + pro);
        
    }
}

class Factorial {
    public static int FactNum(int num) {
        int fact = 1;
        if(num < 0) {
            System.out.println("Invalid number...");
        }
        else {
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }
    }
    System.out.println(fact);
    return fact;
}    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

            FactNum(n);
            
        }
    }
