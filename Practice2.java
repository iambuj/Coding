import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        for(int i =1; i < 11; i++ ) {
            System.out.println(i);
        }
    }    
}

class Ques1 {
    public static void main(String[] args) {
        for(int i =10; i >0; i-- ) {
            System.out.println(i);
        }
    }    
}

class Ques2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i = 2; i<= n; i = i+2) {
            System.out.println(i);
        }
            
    }
}

class Ques3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i = 1; i<= n; i = i+2) {
            System.out.println(i);
        }
    }
}

class Ques4 {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

class Ques5 {
    public static void main(String args[]) {
        for(int i = 5; i <=100; i = i + 5) {
            System.out.println(i);
        }
    }
}

class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.println(fact);         
    }
}

class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++) {
            if(n%i == 0) {
                System.out.println(i);
            }
            else{
                
            }
        }
    }
}