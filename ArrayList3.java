
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int j = 1;
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for(int i = 0; i < size; i++){
            System.out.print("Enter the " + j + " number : ");
            list.add(sc.nextInt());
            j++;
        }
        list.set(1, 100);
        System.out.println("After update = " + list);
        
        try{
            list.remove(3);
            if(size > 3){
                System.out.println("After remove = " + list);
            }
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("At least 4 elements required");
        }
        System.out.println("Contains 50 = " + list.contains(50));
        System.out.println("Final ArrayList = " + list);
    }
}
