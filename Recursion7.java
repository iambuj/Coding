import java.util.Scanner;

public class Recursion7 {
    public static void printTable(int a , int i)  {
        if(i == 11) {
            return;
        }
        System.out.println(a + " x " + i + " = " + a*i);
        printTable(a, i+1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        printTable(sc.nextInt(), 1);
    }
}
