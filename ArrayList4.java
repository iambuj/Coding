
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size  : ");
        int size = sc.nextInt();
        int j = 1;
        java.util.ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + j + " number : ");
            num.add(sc.nextInt());
            j++;
        }
        int largest = num.get(0);
        for (int i = 0; i < size; i++) {
            if(largest < num.get(i)){
                largest = num.get(i);
            }
            
        }
        System.out.println("ArrayList = " + num);
        System.out.println("Largest = " + largest);
    }
}
