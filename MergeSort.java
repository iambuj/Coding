import java.util.Scanner;

public class MergeSort {

    // Array ke do sorted parts ko merge karega
    public static void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];

        int i = start;      // Left part ka starting index
        int j = mid + 1;    // Right part ka starting index
        int k = 0;          // temp array ka index

        // Dono parts ko compare karke temp me daalo
        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Agar left part me elements bach gaye
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Agar right part me elements bach gaye
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // temp ko original array me copy karo
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }


    // Array ko divide karega
    public static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {

            int mid = (start + end) / 2;

            // Left part
            mergeSort(arr, start, mid);

            // Right part
            mergeSort(arr, mid + 1, end);

            // Dono sorted parts ko merge karo
            merge(arr, start, mid, end);
        }
    }


    // Array print
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element : ");
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}