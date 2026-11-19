package Stack;

import java.util.Stack;

class Balanced {
    public boolean balancedBrackets(String brackets) {
        if (brackets == null || brackets.length() % 2 != 0) {
            return false;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char ch = brackets.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            } else {
                // Optional: reject unexpected characters
                return false;
            }
        }

        return st.isEmpty();
    }
}

public class Stack11 {
    public static void main(String[] args) {
        Balanced b = new Balanced();
        String brackets = "{{{({})}}}";
        System.out.println(b.balancedBrackets(brackets)); // true
        System.out.println(b.balancedBrackets("{}[]()"));   // true
        System.out.println(b.balancedBrackets("{[(])}"));   // false
    }
}