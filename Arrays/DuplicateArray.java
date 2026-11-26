
import java.util.HashMap;


class Duplicate{
    public boolean duplicateArray(int arr[]) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int x = map.getOrDefault(arr[i], 0);
            map.put(arr[i], x+1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) > 1){
                return true;
            }
        }
        return false;
    }
}

public class DuplicateArray {
    public static void main(String[] args) {
        Duplicate d = new Duplicate();
        int arr[] = {1,2,3,4,45,5,2};
        System.out.println(d.duplicateArray(arr));
    }
}
