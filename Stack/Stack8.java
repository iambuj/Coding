package Stack;

import java.util.Stack;

public class Stack8 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        int arr[] = {10,20,30,40,50,60};

        for(int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        while(!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
