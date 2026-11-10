public class LinkedList5 {
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

            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }

        public void printList() {
            if(head == null) {
            System.out.println("Empty List");
            return;
        }

        Node currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("null");
        }

        public void deleteFirst() {
            if(head == null) {
                System.out.println("Empty list");
                return;
            }
            head = head.next;
        }

        public void deleteLast(){
            if(head == null) {
                System.out.println("Empty list");
                return;
            }

            if(head.next == null) {
                head = null;
                return;
            }
            Node secondLastNode = head;
            Node lastNode = head.next;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
                secondLastNode = secondLastNode.next;
            }
            secondLastNode.next = null;
        }
    public static void main(String[] args) {
        LinkedList5 list = new LinkedList5();
        list.addFirst("Ambuj");
        list.addLast("Virat");
        list.addLast("Kohli");
        list.addLast("is");
        list.addLast("the");
        list.addLast("No.1");
        list.addLast("Batsman");
        list.addLast("In Cricket");
        list.printList();

        list.deleteFirst();
        list.printList();
        
        list.deleteLast();
        list.printList();



    }
}
