package Stack;

import java.util.Stack;

public class Stack7 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        int arr[] = {10,20,30};
        for(int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        System.out.println("Before Removong : " + st);
        st.pop();
        System.out.println("After Removing : " + st);
        System.out.println("Top of the Stack is = " + st.peek());
    }
}
