import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int a = sc.nextInt();
        System.out.print("Enter your marks : ");
        int b = sc.nextInt();
        System.out.print("Enter your marks : ");
        int c = sc.nextInt();

        int marks[] = new int[3];
        marks[0] = a;
        marks[1] = b;
        marks[2] = c;

        for(int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}

class number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the number : ");
            numbers[i] = sc.nextInt();
            }
            System.out.print("Numbers = ");
            for(int i = 0; i < size; i++) {
        
            System.out.print(numbers[i] + " , ");
        }

    }
}

class Find{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the number : ");
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number to find : ");
        int x = sc.nextInt();
        for(int i = 0; i < size; i++) {
        if(num[i] == x) {
            System.out.println("X founded at " + i);
        }
        else{
            System.out.println("Enter valid number...");
        }
        }
        

    }
}