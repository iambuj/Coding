public class Trees3 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        static class BinaryTree {
            static int index = -1;
            static int count = 0;
            public static Node buildTree(int arr[]) {
                index++;
                if(arr[index] == -1) {
                    return null;
                }
                Node newNode = new Node(arr[index]);
                newNode.left = buildTree(arr);
                newNode.right = buildTree(arr);
                count++;
                System.out.println("Node value = " + newNode.data);
                return newNode;
            }

            public static void countNode() {
                System.out.println("Count is = " + count);
            }   
        }
        public static int countTreeNodes(Node node) {
            if (node == null) {
                return 0;
            }
            return 1 + countTreeNodes(node.left) + countTreeNodes(node.right);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, -1, -1, 4 , 8, 26, -1, -1, 70, 90, -1, -1, -1, -1};
        Node root = Node.BinaryTree.buildTree(arr);
        System.out.println(Node.countTreeNodes(root));

        Node.BinaryTree.countNode();
    }
}
