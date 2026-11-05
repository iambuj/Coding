
import java.util.HashMap;
import java.util.Scanner;

public class HashMap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer , String> map = new HashMap<>();

        map.put(sc.nextInt() , "Ambuj");
        map.put(sc.nextInt() , "Ram");
        map.put(sc.nextInt() , "Krishna");
        map.put(sc.nextInt() , "Virat");
        map.put(sc.nextInt() , "Rahul");
        System.out.print("Enter the number to search : ");
        int searchroll = sc.nextInt();

        for(int key : map.keySet() ) {
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println();
        if(map.containsKey(searchroll)){
            System.out.println("Student Found");
            System.out.println(searchroll + " -> " + map.get(searchroll));
        }
        else{
            System.out.println("Student Not Found");
        }
    }
}
