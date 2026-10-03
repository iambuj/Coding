import java.util.Scanner;

public class MoskQues2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int a = sc.nextInt();
        int Array[] = new int[a];
        for (int i = 0; i < Array.length; i++) {
            System.out.print("Enter the element : ");
            Array[i] = sc.nextInt();
        }
        System.out.println("---- ARRAY ---- ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        
        int largest = Array[0];
        System.out.println("---- LARGEST NUMBER ----");
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] > largest){
                largest = Array[i];
            }
        }
        System.out.println(largest + " is the Largest");
        int smallest = Array[0];
        System.out.println("---- SMALLEST NUMBER ----");
        for (int i = 0; i < Array.length; i++) {
            if(Array[i] < smallest) {
                smallest = Array[i];
            }
        }
        System.out.println(smallest + " is the Smallest");
        System.out.println("---- SUM ----");
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        System.out.println("Sum of Array is = " + sum);

        System.out.println("---- AVERAGE ----");
        int avg = sum/a;
        System.out.println("Average = " + avg);
    }
}