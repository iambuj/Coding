public class LinkedList6 {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
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
        Node curNode = head;
        while(curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    public void printList() {
        if(head == null){
            System.out.println("Empty List");
        }
        Node curNode = head;
        while(curNode.next != null) {
            System.out.print(curNode.data + " -> ");
            curNode = curNode.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        LinkedList6 list = new LinkedList6();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(5);
        list.printList();

    }
}
