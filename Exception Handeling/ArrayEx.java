
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of the array : ");
        int a = sc.nextInt();
        try {
            int arr[] = {10,20,30,40};
            System.out.println(arr[a]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        }
    }
}
