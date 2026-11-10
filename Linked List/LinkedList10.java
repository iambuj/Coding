public class LinkedList10 {
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

    public void findLargsest() {
        int largest = 0;
        Node curNode = head;
        while(curNode.next != null) {
            if(curNode.next.data > curNode.data) {
                largest = curNode.next.data;
            }
            curNode = curNode.next;
        }
        System.out.println("Largest is = " + largest);
    }

    public void printList() {
        if(head == null) {
            System.out.println("Empty List");
            
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data +  " --> ");
            curNode = curNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedList10 list = new LinkedList10();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.printList();
        list.findLargsest();
    }
}
