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
            System.out.print(temp.data); // Print the data
            if (temp.next != null) {
                System.out.print(" -> "); // Print the arrow if there is a next node
            }
            temp = temp.next; // Move to the next node
        }
        System.out.println(" -> null"); // Indicate the end of the list
    }
        // This will print all elements once.
    
    //Delete at Specific Position
    public void deleteAtSpecificpos(int pos){
        if (head == null || pos < 0) { // If the list is empty or the position is invalid
        System.out.println("Invalid position");
        return;
        }
        
        if (pos == 0) { // If we need to delete the head
        head = head.next; // Move head to the next node
        return;
        }
        
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
        temp = temp.next; // Move to the node before the one we want to delete
        }
        
        // If temp is null or temp.next is null, the position is out of bounds
        if (temp == null || temp.next == null) {
        System.out.println("Position out of bounds");
        return;
        }
    
        // Now delete the node at position
        temp.next = temp.next.next; // Bypass the node to be deleted
    }
}

//Step-3: Main class
public class Main{
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.insert(100);
		link.insert(200);
		link.insert(300);
		link.insert(400);
		link.insert(500);
		link.insert(600);
		System.out.println("Original List :");
		link.display();
		System.out.println("Deletion at Specific Position :");
		link.deleteAtSpecificpos(4);
		link.display();// This will print 100, 200, 300, 400, 600
	}
}
