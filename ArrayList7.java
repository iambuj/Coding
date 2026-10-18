
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int size = sc.nextInt();
        java.util.ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number : ");
            number.add(sc.nextInt());
        }
        for (int i = 0; i < number.size(); i++) {

            for (int j = i + 1; j < number.size(); j++) {

                if (number.get(i).equals(number.get(j))) {
                    number.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After removing duplicates : " + number);
    }
}
