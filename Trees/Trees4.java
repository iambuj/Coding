package Trees;
class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


public class Trees4 {
    public static int sumOfNodesn(Node root) {
        if(root == null) {
            return 0;
        }
        return root.data + sumOfNodesn(root.left) + sumOfNodesn(root.right);
    }
    public static void main(String[] args) {
        Node n = new Node(1);
        n.left = new Node(8);
        n.right = new Node(3);
        n.left.left = new Node(16);
        n.left.right = new Node(5);
        n.right.left = new Node(24);
        n.right.right = new Node(7);
        System.out.println(sumOfNodesn(n));
    }
}
