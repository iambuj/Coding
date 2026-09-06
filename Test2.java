import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();

        if(user%2 == 0) {
            System.out.println("Even number ");
        }
        else{
            System.out.println("Odd");
        }
    }
}

class One{
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class Arrin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[][] Ar = new int[1][5];

        for (int i = 0; i < 1; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                int a = sc.nextInt();
                sum += a;
            }
            System.out.println("the sum is = " +sum);
        }
    }
}


class L{
    public static void main(String[] args) {
        String str = "Hello java";
        System.out.println(str.length());
    }
}


class La{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int largest = arr[0];
        
        
        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            if(largest > arr[i]){
                largest += arr[i];
            }
        }
        System.out.println(largest);
    }
}

class Evar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        int co = 0;
        int Even[] = new int[a];
        
        for (int i = 0; i < a; i++) {
            System.out.print("Enter the number : ");
            int x = sc.nextInt();
            if(x % 2 == 0) {
                co++;
            }
        }
        System.out.println(co);
    }
}

class Reva{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String[] rev = new String[sb.length()];

        sb.reverse();
        System.out.println(sb);
        
    }
}
