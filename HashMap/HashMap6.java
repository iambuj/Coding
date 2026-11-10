package HashMap;


public class HashMap6 {

    class Node{
        int key;
        int value;
        Node next;

        public Node(int key , int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    Node[] buckets = new Node[5];


    public void put(int key , int value){
        int idx = key % buckets.length;
        Node currNode = buckets[idx];

        while(currNode != null) {
            if(currNode.key == key) {
                currNode.value = value;
                return;
            }

            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        
    }
}
