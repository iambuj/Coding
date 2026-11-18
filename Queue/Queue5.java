package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue5 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int arr[] = {5,10,15};

        for(int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }

        System.out.println(q);        
        q.remove();

        System.out.println(q);
    }
}
