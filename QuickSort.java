import java.util.*;
public class QuickSort {
    public static int partition(int arr[] , int low , int high) {
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[] , int low , int high) {
        if(low < high){
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("enter the element : ");
            arr[i] = sc.nextInt();
        }
        int n = arr.length;

        quickSort(arr, 0, n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}