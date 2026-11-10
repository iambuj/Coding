package HashMap;

import java.util.HashMap;

public class HashMap7 {
    public static void main(String[] args) {
        HashMap<Integer , Integer> map = new HashMap<>();

        int arr[] = {7, 3 , 7 , 9 , 7 , 6 , 3 , 7 , 3};
        int req = arr.length/4;
        for(int i = 0; i < arr.length; i++) {
            int x = map.getOrDefault(arr[i], 0);
            map.put(arr[i], x + 1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) > req){
                System.out.println(key + " -> " + map.get(key));
            }
        }
        
    }
}
