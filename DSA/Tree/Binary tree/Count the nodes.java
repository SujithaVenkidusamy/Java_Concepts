// Count the number of nodes in Binary tree

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int value){
        this.value = value;
        this.left= null;
        this.right= null;

    }
}

class BinaryTree{
    TreeNode root;
    
    public int countNodes(TreeNode node){
        if(node==null){
            return 0;
        }
        
        return 1 + countNodes(node.left) + 
        countNodes(node.right);
        
    }

}

public class Main{
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left =new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        
        int nodeCount = tree.countNodes(tree.root);
        
        System.out.println("Number of nodes :" + nodeCount);
    }
}
