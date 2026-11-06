
import java.util.HashMap;

public class HashMap5 {
    public static void main(String[] args) {
        HashMap<Integer ,  Integer> map = new HashMap<>();
        int arr[] = {1, 2, 2, 3, 1, 2, 4, 3, 1};
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
