package HashMap;

import java.util.HashMap;

class FindNumber{
    public int findNumberN(int arr[]) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int m = arr.length/2;
        for(int i = 0; i < arr.length; i++) {
            int x = map.getOrDefault(arr[i], 0);
            map.put(arr[i], x+1);
        }
        int ans = 0;
        for(int i = 0; i < map.size(); i++) {
            if(map.get(arr[i]) > m) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
public class HashMap11 {
    public static void main(String[] args) {
        FindNumber fn = new FindNumber();
        int arr[] = {1,1,1,1,1,1,1,1,4,2,6,8};
        System.out.println(fn.findNumberN(arr));
    }
}
