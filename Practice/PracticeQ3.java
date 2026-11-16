package Practice;
import java.util.*;
class ReverseArray{
    public int[] revArray(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }
}

public class PracticeQ3 {
    public static void main(String[] args) {
        ReverseArray rv = new ReverseArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        System.out.println(Arrays.toString(arr).toCharArray());
        rv.revArray(arr);
        System.out.println("After reverse : ");
        System.out.println(Arrays.toString(arr));
    }
}
