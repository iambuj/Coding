import java.util.Scanner;

public class Stack2 {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty() == true) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if(head == null) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if(head == null ){
                return -1;
            }

            int top = head.data;
            return top;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack(); 
        System.out.print("enter the size of stack : ");
        int size = sc.nextInt();
        for(int i = 0; i < size; i++) {
            System.out.print("Enter the element : ");
            s.push(sc.nextInt());
        }
        System.out.println("Top = " +  s.peek());
        System.out.println("Size is = " + size);
        while(! s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
