import java.util.*;

public class Verfication {
    public static void main(String[] args) {
        Scanner isadult = new Scanner(System.in);
        int age = isadult.nextInt();

        if(age >=18 ) {
            System.out.print("Your Are An Adult");
        }
        else {
            System.out.print("You Are A Minor");
        }
        
    }
}

class Oddeven {
    public static void main(String args[]) {
        Scanner oe = new Scanner(System.in);
        int num = oe.nextInt();

        if(num%2 == 0) {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}

class Compare {
    public static void main(String agrs[]) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();

        if(a == b ) {
            System.out.println(a + " is = " + b);
        }
        else if(a > b ) {
            System.out.println(a + " is greater than " + b);
        }
        else{
            System.out.println(b + " is greater than " + a);
            }
        }
    }

class Greeting {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int lang = inp.nextInt();
        String name = inp.next();
        if(lang == 1) {
            System.out.println("Hello " + name);
        }
        else if(lang == 2) {
            System.out.println("Namaste " + name );
        }
        else if(lang == 3) {
            System.out.println("Bonjoure " + name);
            }
        else {
            System.out.println("Enter valid number...");
            }
        }
    }

class Wish {
    public static void main(String[] args) {
        Scanner grt = new Scanner(System.in);
        int button = grt.nextInt();
        String name = grt.next();

        switch(button) {
        
        case 1: System.out.println("Hello " + name);
        break;
        case 2: System.out.println("Namaste " + name);
        break;
        case 3: System.out.println("Bonjoure " + name);
        break;
        default: System.out.println("Invalid Button...");
        }
    }
}