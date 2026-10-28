import java.util.Scanner;
import java.util.Stack;

public class Stack5 {
    Stack<Integer> list = new Stack<>();
    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(int data ) {
        list.add(data);
    }
    
    public int pop() {
        return list.remove(list.size() - 1);
    }
    
    // public void reverse() {
    //     list.reversed();
    // }

    // public void isPalindrome() {
    //     if(list.size() == 0) {
    //         System.out.println("Empty Stack...");
    //     }
    //     if(list == list.reversed()) {
    //         System.out.println("Palindrome...");
    //     }
    //     System.out.println("Not a Palindrome...");
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack5 st = new Stack5();
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number : ");
            st.push(sc.nextInt());
        }
        while(! st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
