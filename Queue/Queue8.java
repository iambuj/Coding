package Queue;

import java.util.LinkedList;
import java.util.Queue;

class ReverseQueueK{
    public Queue<Integer> reverseQK(int arr[] , int k) {
        Queue<Integer> q = new LinkedList<>();
        int left  = 0;
        int right = k;
        while(left < k) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for(int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        return q;
    }
}

public class Queue8 {
    public static void main(String[] args) {
        ReverseQueueK rqk = new ReverseQueueK();
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
        int k = 6;
        System.out.println((rqk.reverseQK(arr, k)));
    }
}