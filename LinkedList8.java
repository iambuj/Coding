public class LinkedList8 {
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
        if(head == null){
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
        }
        
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void checkNumber(int n) {
        int idx = 0;
        Node currNode = head;
        while(currNode != null) {
            if(n == currNode.data) {
                System.out.println( n + "Founded at index " + idx);
            }
            else{
                System.out.println("Not Found");
            }
            currNode = currNode.next;
            idx++;
        }
    }
    public static void main(String[] args) {
        LinkedList8 list = new LinkedList8();
        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(60);
        list.printList();
        list.checkNumber(60);
    }
}
