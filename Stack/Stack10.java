package Stack;

import java.util.Stack;

class ReverseString{
    public String reveString(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}

public class Stack10 {
    public static void main(String[] args) {
        String str = "hello world";
        ReverseString rv = new ReverseString();
        System.out.println(rv.reveString(str));
    }
}
