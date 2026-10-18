
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int size = sc. nextInt();
        java.util.ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i+1) + " number  : ");
            num.add(sc.nextInt());
        }
        System.out.print("Enter the number to Find : ");
        int same = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(same == num.get(i)) {
                count++;
            }
        }
        System.out.println("Frequency of " + same + " = " + count);
    }
}
