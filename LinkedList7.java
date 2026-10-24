
import java.util.Scanner;

public class LinkedList7 {
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

        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList() {
        if(head == null) {
            System.out.println("Empty List");
        }
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteNthFromEnd(int n) {
        int size = 0;
        Node currNode = head;
        while(currNode.next != null) {
            size++;
            currNode = currNode.next;
        }

        if(n <= 0 || n > size){
            System.out.println("Invalid Position");
            return;
        }

        if(n == size) {
            head = head.next;
            return;
        }

        int position = size - n;
        Node prevNode = head;

        for(int i = 1; i < position; i++) {
            prevNode = prevNode.next;
        }
        prevNode.next = prevNode.next.next;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList7 list =  new LinkedList7();
        list.addFirst(50);
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);

        System.out.println("Original List : ");
        list.printList();

        list.deleteNthFromEnd(2);

        System.out.println("After Deleting : ");
        list.printList();
    }
}
