
import java.util.Scanner;

public class InsertionSort {
    public static void PrintInsertion(int[] insertion) {
        for (int i = 0; i < insertion.length; i++) {
            System.out.print(insertion[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the size : ");
        int a = sc.nextInt();
        int insertion[] = new int[a]; 
        for (int i = 0; i < insertion.length; i++) {
            System.out.print("Enter the elemnt : ");
            insertion[i] = sc.nextInt();
        }

        for (int i = 1; i < insertion.length; i++) {
            int key = insertion[i];
            int j = i-1;

            while (j >= 0 && insertion[j] > key) { 
                insertion[j + 1] = insertion[j];
                j--;
            }
            insertion[j + 1] = key;
        }
        PrintInsertion(insertion);
    }
}
