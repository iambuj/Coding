
import java.util.HashMap;

public class HashMap2 {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Ram", 99);
        map.put("Shayam", 18);
        map.put("Abhinav", 93);
        map.put("Om", 89);
        map.put("Rahul", 98);

        System.out.println(map.size());
        System.out.println(map.get("Rahul"));
        
    }
}
