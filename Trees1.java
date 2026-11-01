public class Trees1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }        
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTRee(int node[]) {
            idx++;
            if(node[idx] == -1){
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTRee(node);
            newNode.right = buildTRee(node);

            return newNode;
        }
    } 
    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTRee(node);
        System.out.print(root.data);
    }
}
