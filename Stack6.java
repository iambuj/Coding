import java.util.Scanner;
import java.util.Stack;

public class Stack6 {

    public static void atBottom(int data , Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        atBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        atBottom(top, s);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack : ");
        int size = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number : ");
            st.push(sc.nextInt());
        }

        reverse(st);

        while(! st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
