//Step-1: Create class
class Node{
    int data;
    Node next;
    //Step-2: Create a constructor
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
//Step-4:
class LinkedList{
    Node head,tail;
    //Insert
    public void insert(int data){
        Node newNode=new Node(data);
        //newNode.next=head;//This make the code to run in a loop
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;// Connect the current tail to the new node
            tail=newNode;// Update tail to the new node
        }
    }
    //Display
    public void display() {
        Node temp = head;
        while (temp != null) { // Iterate until temp is null
            System.out.println(temp.data);
            temp = temp.next; // Move to the next node
        }
        // This will print all elements once.
    }
}
//Step-3: Main class
public class Main{
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.insert(100);
		link.insert(200);
		link.insert(300);
		link.display();// This will print 100, 200, 300
	}
}
