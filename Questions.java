import java.util.*;

public class Questions {
// Area of Rectangle --
    public static void main(String[] args) {
        Scanner LB = new Scanner(System.in);
        int l = LB.nextInt();
        int b = LB.nextInt();
        int area = l * b;
        System.out.print("The area of Rectangle is = " + area + "cmsq");
    }
}

class Celtofe {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int cel = temp.nextInt();
        int con = (((cel * 9)/5) + 32);
        System.out.print(cel + "degree C in fahrenhiet is = " + con + "degree F");
    }
}

class Age {
    public static void main(String[] args) {
        Scanner ag = new Scanner(System.in);
        int a = ag.nextInt();
        System.out.print("You are " + a + " Year old");
    }
}

class Avg {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b  = num.nextInt();
        int c = num.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("The average of a b c is = " + avg);

    }
}

class Sqc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int sq = a*a;
        int cu = a*a*a;
        System.out.println("Square of " + a + " is = " + sq);
        System.out.print("Cube of " + a + " is = " + cu);

    }
}