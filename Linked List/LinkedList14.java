public class LinkedList14 {
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
        if(head == null) {
            System.out.println("Empty List");
            return;
        }
        Node curNode = head;
        while(curNode.next != null) {
            System.out.print(curNode.data + " --> ");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }

    public void deleteLast() {
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

    public void insertAtPosition(int position , int data){
        Node newNode = new Node(data);
        int size = 0;
        Node currNode = head;
        while(currNode !=  null) {
            size++;
            currNode = currNode.next;
        }
        if(position < 0) {
            return;
        }
        if(position > size) {
            System.out.println("Enter valid index ");
            return;
        }
        if(position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        currNode = head;
        for(int i = 0; i < position - 1; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;      
    }
    public static void main(String[] args) {
        LinkedList14 list = new LinkedList14();

        list.addLast(10);
        list.addLast(20);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.printList();
        list.deleteLast();
        list.printList();
        list.insertAtPosition(2, 90);
        list.printList();
    }
}