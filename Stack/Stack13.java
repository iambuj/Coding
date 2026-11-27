package Stack;
import java.util.*;
class ValidParentheses{
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }

                if(st.peek() == '(' && s.charAt(i) == ')' || st.peek() == '[' && s.charAt(i) == ']' || st.peek() == '{' && s.charAt(i) == '}') {
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
public class Stack13 {
    public static void main(String[] args) {
        ValidParentheses vd = new ValidParentheses();
        String s = "()[]{}";
        System.out.println(vd.isValid(s));
    }
}
