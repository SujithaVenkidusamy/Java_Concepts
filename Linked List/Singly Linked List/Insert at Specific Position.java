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
    //Insert at End
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
        System.out.println(); // Indicate the end of the list
    }
        // This will print all elements once.
    
    //Insert at Begining
    public void insertAtBegining(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
        
    }
    //Insert at Specific Position
    public void insertAtSpecificPos(int data,int pos){
        Node newNode= new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
            newNode.next=temp.next;
            temp.next=newNode;
        }
        
    }
}
//Step-3: Main class
public class Main{
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		link.insert(100);
		link.insert(200);
		link.insert(300);
		System.out.println("Original List :");
		link.display();
		System.out.println("Insert at Specific Position:");
		link.insertAtSpecificPos(4181,2);
		link.display();// This will print 100, 200, 4181, 300
	}
}
