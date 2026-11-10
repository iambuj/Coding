public class LinkedList13 {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node cuNode = head;
        while(cuNode.next != null) {
            cuNode = cuNode.next;
        }
        cuNode.next = newNode;
    }

    public void printList() {
        if(head == null) {
            System.out.println("Empty List");
            return;
        }

        Node cuNode = head;
        while(cuNode != null) {
            System.out.print(cuNode.data + " --> ");
            cuNode = cuNode.next;
        }
        System.out.println("Null");
    }
    public void reverseList() {
        if(head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;   
    }
    public static void main(String[] args) {
        LinkedList13 list = new LinkedList13();

        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addLast(500);
        list.addFirst(100);
        System.out.print("List : ");
        list.printList();
        list.reverseList();
        System.out.print("Reverse List : ");
        list.printList();
        
    }
}
