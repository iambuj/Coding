package Practice;

import java.util.HashMap;

public class PracticeQ1 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 20, 10};

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int x = map.getOrDefault(arr[i] , 0);
            map.put(arr[i], x+1);
        }

        for(int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
