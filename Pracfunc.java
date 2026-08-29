import java.util.Scanner;

// Average of Three numbers -----

public class Pracfunc {
    public static int Average(int a , int b , int c) {
        int avg = (a+b+c)/3;
        System.out.println(avg);
        return avg;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number : ");
        int num3 = sc.nextInt();

        Average(num1, num2, num3);
    }
}

// Sum of all odd numbers 1 to n -----

class SimpleOddSum {

    public static int getSumOfOdds(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i += 2) {
            sum = sum + i;
        }
        
        return sum; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = getSumOfOdds(number);
        
        System.out.println("The sum is: " + result);
        
        scanner.close();
    }
}

// Grestest of two numbers ---

class Greatest { 
    public static int GreatestNumber(int a , int b) {
        if(a>b) {
            return a;
        }
        else{
            return b;
        }
 
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int num1 = sc.nextInt();

        System.out.print("Enter the number : ");

        int num2 = sc.nextInt();

        int result = GreatestNumber(num1, num2);
        System.out.println(result + " is the greatest number");
    }
}

// Circumference of circle -----


class Circle {
    public static double Circumference(int r) {
        if(r < 0){
            System.out.println("Enter valid number...");
            return 0;
        } 
        else{
            return (2.0 * r * 22) / 7.0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        double print = Circumference(radius);
        System.out.println(print);
    }
}

// Checking Eligibility for voting

class Voting{
    public static String IsAdult(int a) {
        if(a >= 18){
            return "You Can Vote";
        }
        else{
            return "You Can not Vote...";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age : ");
        int age = sc.nextInt();

        String vote = IsAdult(age);
        System.out.println(vote);
        
    }
}


// Infinite loop using DO While Method ----

// class InfiniteLoop {
//     public static int Infinite(int a){
//         do { 
//             int i = 1;
//             i++;
//             return i*a;
            
//         }
//         while ( a < 10);
//     }

//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int x = Infinite(n);
//         System.out.println(x);
//     }
// }

class LoopDemo {

    public static void main(String[] args) {
        // Calling the function execution
        executeInfiniteLoop();
    }

    // Function that contains the infinite do-while loop
    public static void executeInfiniteLoop() {
        do {
            System.out.println("Processing data in a loop...");
        } while (true); // Always true
    }
}
