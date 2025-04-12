import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class Main{
	
	public static int maximumElement(Node root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		int leftMax = maximumElement(root.left);
		int rightMax = maximumElement(root.right);
		return Math.max(root.data,Math.max(leftMax,rightMax));
	}
		
		
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Node root=new Node(40);
		root.left=new Node(23);
		root.right=new Node(45);
		root.left.left=new Node(19);
		root.left.right=new Node(27);
		root.right.left=new Node(40);
		root.right.right=new Node(52);
		System.out.print(maximumElement(root));
	}
}
		
		
		
			
