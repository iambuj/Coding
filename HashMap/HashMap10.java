package HashMap;
import java.util.*;
public class HashMap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ambuj", 18);
        map.put("Ayushmaan", 99);
        map.put("Virat", 17);

        System.out.print("Enter the key to search : ");
        if(map.containsKey(sc.nextLine()) == true) {
            System.out.println("Student Founded");
        }
        else{
            System.out.println("Not Found");
        }
    }
}