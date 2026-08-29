import java.util.*;

public class Test {
    // checking number is odd or even -----------
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        
        if(number%2 == 0) {
            System.out.println("Even number ");
        }
        else{
            System.out.println("Odd number ");
        }
    }
}

// Table of a number ----------

class Table{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(i*n);
        }
    }
}

// Function Which checks tht u can vote or not ??

class Main{
    public static String Voting(int a) {
        if(a >= 18) {
            return "You can vote";
        }
        else{
            return "You can not vote";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int age = sc.nextInt();
        String x = Voting(age);
        System.out.println(x);


    }
}

// Finding the maximum of 2 numbers ----------

class Main2 {
    public static String FindMaxn(int a , int b) {
        if(a > b) {
            return a + " means a is the greatest number";
        }
        else{
            return b + " means b is the greatest number ";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num2 = sc.nextInt();

        String max = FindMaxn(num1, num2);
        System.out.println(max);

    }
}