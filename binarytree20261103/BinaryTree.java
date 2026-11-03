package binarytree20261103;

class Tree {
    int data;
    Tree left;
    Tree right;

    public Tree(int data) {
        this.data = data;
    }
    
}
public class BinaryTree {
    public static int sumOfNodes(Tree root) {
        if(root == null) {
            return 0;
        }

        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        System.out.println(sumOfNodes(root));

    }
}
