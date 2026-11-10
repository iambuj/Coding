
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.print("Enter the number to find : ");
        int n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element : ");
            list.add(sc.nextInt());
        }
        // Searching for the element --------
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if(n == list.get(i)) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + index);
        }
        System.out.println("Linked List = " + list);
    }
}
