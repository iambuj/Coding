import java.util.Collections;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>(size);
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the number : ");
            numbers.add(sc.nextInt());
        }
        System.out.println(numbers);
        numbers.add(10);
        System.out.println(numbers);
        numbers.add(size+1, 33);
        System.out.println(numbers);
        System.out.print("Enter the index to get : ");
        int a = sc.nextInt();
        int x = numbers.get(a);
        System.out.println("The element on index a is = " + x);
        System.out.print("Enter the index of the number to delete : ");
        int b = numbers.remove(sc.nextInt());
        Collections.sort(numbers);
        System.out.println("Sorted Array = " + numbers);
        System.out.println("Size of the Array = " + numbers.size());
    }
}