package HashMap;

import java.util.HashMap;

public class HashMap3 {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("Laptop" , 50000);
        map.put("Mobile" , 10000);
        map.put("Tablet" , 25000);
        map.put("Mobile", 30000);

        for(String key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
