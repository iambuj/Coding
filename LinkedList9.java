

public class LinkedList9 {
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
        while(curNode.next != null){
            curNode = curNode.next;
        }

        curNode.next = newNode;
    }

    public void printList() {
        int size = 0;
        if(head == null) {
            System.out.println("Empty list");
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " --> ");
            size++;
            currNode = currNode.next;
        }
        System.out.println("Null");

    }

    public void sizeOfList(){
        int size = 0;
        Node currNode = head;
        while(currNode != null) {
            size++;
            currNode = currNode.next;
        }
        System.out.println("Size is = " + size);
    }
    public void sumOfNodes() {
        int sum = 0;
        Node curNode = head;
        while(curNode != null) {
            sum += curNode.data;
            curNode = curNode.next;
        }
        System.out.println("Sum of Nodes is = " + sum);
    }
    public static void main(String[] args) {
        LinkedList9 list = new LinkedList9();

        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addFirst(10);
        System.out.print("List : ");
        list.printList();
        list.sizeOfList();
        list.sumOfNodes();
    }
}