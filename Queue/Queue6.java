package Queue;

import java.util.*;
class ReverseQueue{
    public int[] reverseQueue(int arr[]) {
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }

        Stack<Integer> st = new Stack<>();

        while(!q.isEmpty()){
            st.push(q.remove());
        }

        int[] reversed = new int[st.size()];
        for(int i = 0; i < reversed.length; i++) {
            reversed[i] = st.pop();
        }
        return reversed;
    }
}

public class Queue6 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        ReverseQueue rv = new ReverseQueue();
        int[] reversed = rv.reverseQueue(arr);
        System.out.println(Arrays.toString(reversed));
    }
}
