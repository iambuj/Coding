package Trees;
public class Trees2 {
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
        public static Node buildTRee(int arr[]) {
            idx++;
            if(arr[idx] == -1){
                System.out.println( "index =  " + idx);
                return null;
            }

            Node newNode = new Node(arr[idx]);
            newNode.left = buildTRee(arr);
            newNode.right = buildTRee(arr);
            System.out.println("Node value : " + newNode.data );
            return newNode;
        }
    } 
    public static void main(String[] args) {
        int arr[] = {1, 2, -1, -1, 4 , 8, 26, -1, -1, 70, 90, -1, -1, -1, -1    };
        Node root = Trees2.BinaryTree.buildTRee(arr);
        System.out.print(root.data);
    }
}
