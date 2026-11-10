package HashMap;
import java.util.*;
public class HashMap9 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int arr1[] = {7, 3 ,9};
        int arr2[] = {6, 3, 2, 7, 3, 9 ,4};
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        java.util.ArrayList<Integer> newlist = new java.util.ArrayList<>();
        int count = 0;
        for(int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])) {
                newlist.add(arr2[i]);
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(newlist);
        System.out.println(count);
    }
}
