
import java.util.Scanner;

public class SelectionSort {
    public static void PrintSelection(int Selection[]) {
            for (int i = 0; i < Selection.length; i++) {
                System.out.print(Selection[i] + " ");
            }
        }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n  = sc.nextInt();
        int Selection[] = new int[n];
        for (int i = 0; i < Selection.length; i++) {
            System.out.print("Enter the element  : ");
            Selection[i] = sc.nextInt();
        }

        for (int i = 0; i < Selection.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < Selection.length; j++) {
                if(Selection[smallest] > Selection[j]) {
                    smallest = j;
                }
                int temp = Selection[smallest];
                Selection[smallest] = Selection[i];
                Selection[i] = temp;
            }
        }
        PrintSelection(Selection);
    }
}
