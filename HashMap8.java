import java.util.*;
public class HashMap8 {
    public static void main(String[] args) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int arr1[] = {7, 3 , 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        for(int i = 0; i < arr1.length; i++) {
            map.put(arr1[i] , 1);
        }

        for(int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], 1);
        }
        int arr3[] = new int[map.size()];
        int a = 0;
        for(int key : map.keySet()){
            arr3[a] = key;
            a++;
        }
        System.out.print(java.util.Arrays.toString(arr3));
    }
}
