public class LinkedList11 {
    Node head;

    class Node{
        String data;
        Node next;
        

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
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
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // public void deleteFirst(){
    //     head.next = head;
    // }

    public void deleteLast(){
        if(head == null) {
            return;
        }

        if(head.next == null ) {
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
        LinkedList11 list = new LinkedList11();
        list.addLast("Name");
        list.addLast("is");
        list.addLast("Ambuj Tripathi");
        list.addFirst("My");
        list.addFirst("18");
        list.addFirst("is");
        list.addFirst("age");
        list.addFirst("My");
        list.addLast("End");
        list.deleteLast();
        list.printList();
    }
}
