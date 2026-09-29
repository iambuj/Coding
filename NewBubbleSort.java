import java.util.Scanner;

public class NewBubbleSort {

    public static void PrintBuble(int[] bub) {
        for (int i = 0; i < bub.length; i++) {
            System.out.print(bub[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in array : ");
        int n = sc.nextInt();

        int bub[] = new int[n];

        // Input
        for (int i = 0; i < bub.length; i++) {
            System.out.print("Enter the element : ");
            int el = sc.nextInt();
            bub[i] = el;
        }

        // Bubble Sort
        for (int i = 0; i < bub.length - 1; i++) {

            for (int j = 0; j < bub.length - i - 1; j++) {

                if (bub[j] > bub[j + 1]) {

                    // Swap
                    int temp = bub[j];
                    bub[j] = bub[j + 1];
                    bub[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        PrintBuble(bub);

        sc.close();
    }
}