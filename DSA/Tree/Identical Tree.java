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
class Tree {
    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }
}
class Main {
    public static boolean isIdentical(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }

        if (a != null && b != null) {
            return (a.data == b.data) &&
                    isIdentical(a.left, b.left) &&
                    isIdentical(a.right, b.right);
        }

        return false;
    }

    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(30);
        bst.insert(40);
        bst.insert(50);
        bst.insert(60);
        bst.insert(70);

        Tree cst = new Tree();
        cst.insert(10);
        cst.insert(20);
        cst.insert(30);
        cst.insert(20); 
        cst.insert(80);
        cst.insert(60);
        cst.insert(70);

        if (isIdentical(bst.root, cst.root)) {
            System.out.println("Trees are identical");
        } else {
            System.out.println("Trees are NOT identical");
        }
    }
}
