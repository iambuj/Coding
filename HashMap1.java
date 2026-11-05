
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();
        map.put(18, "Abhinav");
        map.put(7, "Saurabh");
        map.put(45, "Aditya");

        System.out.println(map.containsKey(45));
        System.out.println(map);
        System.out.println(map.get(18));
    }
}
