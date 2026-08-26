import java.util.Scanner;

public class Practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("Positive");
        }
        else if(num < 0) { 
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}

class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num % 2==0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}

class Threenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();

        if(a>b && a>c) {
            System.out.println("a is largest");
        }
        else if(b>a && b>c) {
            System.out.println("b is largest");
        }
        else if(c>a && c>b) {
            System.out.println("c is largest");
        }
        else{
            System.out.println("All are Equal...");
        }
    }
}

class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        if(year%4 == 0 ) {
            System.out.print("Leap Year");
        }
        else{
            System.out.println("Not leap year");
        }
    }
}

class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter : ");
        String vow = sc.next();
        switch(vow) {

        case "a", "e", "i" ,"o", "u": System.out.println("It is a vowel ");
        break;
        default: System.out.println("It's not a vowel ");
        }
    }
}

class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the number : ");
        int num = sc.nextInt();
        
        if(num % 5 == 0 && num % 11 == 0) {
            System.out.println("it is divisivible by both ");
        }
        else{
            System.out.println("Its not divisible");
        }
    }
}

class Voting {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("You are eligible to vote...");
        }
        else {
            System.out.println("You are not eligible to vote...");
        }
    }
}

class multiple {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 7 == 0) {
            System.out.println("Yes it is divisible");
        }
        else{
            System.out.println("No it is not Divisible");
        }
    }
}

class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        if(num >= 10 && num <= 99) {
            System.out.println("Two Digit Number...");
        }
        else if(num >= 100 && num <= 999) {
            System.out.println("Three Digit Number");
        }
        else if(num >= 1000 && num <= 9999) {
            System.out.println("Four Digit Number...");
        }
        else {
            System.out.println("Not Defined...");
        }
    }
}