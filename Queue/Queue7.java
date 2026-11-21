package Queue;

import java.util.Stack;
class QueueSum {
    public int sumOfQueue(int arr[]) {
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        int sum = 0;
        while(!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}
public class Queue7 {
    public static void main(String[] args) {
        QueueSum qs = new QueueSum();
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum of Queue is = " + qs.sumOfQueue(arr));
    }
}
