import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        java.util.ArrayList<Integer> nums = new java.util.ArrayList<>();
        int j = 1;
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the " + j + " number : ");
            nums.add(sc.nextInt());
            j++;
        }
        
        System.out.println("ArrayList = " + nums);
        System.out.println("Total elements = " + nums.size());
        System.out.println("Element at index  2 = " + nums.get(2));
    }
}
