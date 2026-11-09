import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int arr[] = {10, 20, 10, 30, 20, 40, 30};

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for(int key : set) {
            System.out.print(key + " ");
        }
    }
}
