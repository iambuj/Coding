
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        if (size != 3) {
            System.out.println("Please enter exactly 3 elements.");
            return;
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number : ");
            list.add(sc.nextInt());
        }
        System.out.println("Linked List = " + list);
        list.addFirst(5);
        System.out.println("Updated Linked List = " + list);
        list.addLast(40);
        System.out.println("Updated Linked List = " + list);
        list.remove(2);
        System.out.println("Updated Linked List = " + list);
    }
}
