package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<Integer> set  = new HashSet<>();
        int arr1[] = {10, 20, 30, 40, 50};
        int arr2[] = {30, 40, 50, 60, 70};

        for(int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])) {
                list.add(arr2[i]);
                set.remove(i);
            }
        }
        System.out.println(list);
    }
}
