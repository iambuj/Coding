
import java.util.Scanner;

public class Queue1 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        public Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if(rear == size-1){
                System.out.println("Queue is Full ");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue : ");
        int size = sc.nextInt();
        Queue q = new Queue(size);
        for(int i = 0; i < size; i++) {
            System.out.print("Enter a number : ");
            q.add(sc.nextInt());
        }
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
