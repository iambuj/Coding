public class LinkedList12 {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
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

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if(head == null) {
            System.out.println("Empty List");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void deleteFirst() {
        if(head == null) {
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        
        head = head.next;
    }

    public void deleteLast(){
        if(head == null) {
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    public static void main(String[] args) {
        LinkedList12 list = new LinkedList12();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.printList();
        list.deleteLast();
        System.out.print("After deleting Last Node : ");
        list.printList();
        list.deleteFirst();
        System.out.print("After deleting first Node : ");
        list.printList();
    }
}
