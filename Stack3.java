public class Stack3 {
    static class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(String data) {
            Node newNode = new Node(data);
            if(isEmpty() == true) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public String pop() {
            if(isEmpty() == true) {
                return "Empty Stack";
            }
            String top = head.data;
            head = head.next;
            return top;
        }

        public String peek() {
            if(isEmpty() == true) {
                return "Empty";
            }
            String top = head.data;
            return top;
        }
        public int size() {
            int size = 0;
            if(isEmpty() == true) {
                return 0;
            }
            Node currNode = head;
            while(currNode != null) {
                size++;
                currNode = currNode.next;
            }
            return size;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("J");
        st.push("U");
        st.push("B");
        st.push("M");
        st.push("A");
        System.out.println("Size = " + st.size());

        while(! st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
