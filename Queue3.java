public class Queue3 {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if(tail == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if(isEmpty()) {
                return -1;
            }
            int front = head.data;
            if(head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.print("Top is = ");
        System.out.println(q.peek());
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
