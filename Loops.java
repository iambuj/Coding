import java.util.Scanner;

public class Loops {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String name = sc.next();
        
        for(int x = 0; x < 10; x = x + 1) {
            System.out.println(name);
        }
    }
}

class Count {
    public static void main(String[] args) {
        for (int n = 0; n < 11; n++) {
            System.out.println(n);
        }
    }
}

class Whilec {
    public static void main(String args[]) {
        int a = 0;
        while(a < 11) {
            System.out.println(a);
            a++;
        }
    }
}

class Dowhilec {
    public static void main(String args[]) {
        int a = 0;
        do{
            System.out.println(a);
            a++;
        }
        while(a < 11);
    }
}

class Sumofn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is = " +sum);
    }
}

class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for(int i = 1; i<11; i++) {
            System.out.println(num*i);
        }
    }
}

class Table2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        int i = 1;

        while (i < 11) { 
            System.out.println(a*i);
            i++;
        }
    }
}

class Table3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i = 1;

        do{
            System.out.println(i*n);
            i++;
        }
        while(i<11);

    }
}