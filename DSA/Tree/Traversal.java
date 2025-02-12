import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    // Insert method for adding nodes to the BST
    public Node insert(Node root, int val) {
        // If root is null, create a new node and return it
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // Otherwise, insert the value in the left or right subtree
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;  // Return the updated root
    }
    
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);  // Traverse left subtree
            System.out.print(root.val + " ");  // Print the root value
            inOrderTraversal(root.right);  // Traverse right subtree
        }
    }
    
    public void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.val + " ");  // Print the root value
            preOrderTraversal(root.left);  // Traverse left subtree
            preOrderTraversal(root.right);  // Traverse right subtree
        }
    }
    
    public void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);  // Traverse left subtree
            postOrderTraversal(root.right);  // Traverse right subtree
            System.out.print(root.val + " ");  // Print the root value
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create the root node
        Node root = new Node(10);
        
        // Insert values into the tree
        root.insert(root, 1);
        root.insert(root, 12);
        root.insert(root, 3);
        root.insert(root, 4);
        root.insert(root, 15);
        root.insert(root, 26);
        
        System.out.println("In-order Traversal of the BT:");
        root.inOrderTraversal(root);//Method call
        System.out.println();
        
        System.out.println("Pre-order Traversal of the BT:");
        root.preOrderTraversal(root);//Method call
        System.out.println();
        
        System.out.println("Post-order Traversal of the BT:");
        root.postOrderTraversal(root);//Method call
        
    }
}
