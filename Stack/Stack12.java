package Stack;

import java.util.Stack;

class BiggestinStack{
    public int largestnumber(int nums[]) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < nums.length; i++) {
            st.push(nums[i]);
        }
        if(st.isEmpty()) {
            return 0;
        }
        int largest = st.peek();
        while(!st.isEmpty()) {
            if(largest < st.peek()-1 ) {
                largest = st.peek()-1;
            }
            st.pop();
        }
        return largest;
    }
}
public class Stack12 {
    public static void main(String[] args) {
        BiggestinStack bg = new BiggestinStack();
        int nums[] = {1,99,22,34,55,100};
        System.out.println("Largests number in stack = " + bg.largestnumber(nums));
    }
}
