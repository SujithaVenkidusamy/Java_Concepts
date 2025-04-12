import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Main {

    public boolean isBst(Node root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max) return false;

        return isBST(root.left, min, root.data) &&
               isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(40);
        root.left = new Node(23);
        root.right = new Node(45);
        root.left.left = new Node(19);
        root.left.right = new Node(27);
        root.right.left = new Node(44);  
        root.right.right = new Node(52);

        Main obj = new Main();
        if (obj.isBst(root)) {
            System.out.println("Tree is a BST");
        } else {
            System.out.println("Tree is NOT a BST");
        }
    }
}

	
