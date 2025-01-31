class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;
    Node tail = null;

    // Insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point tail to head to make it circular
        } else {
            tail.next = newNode; // Connect current tail to the new node
            tail = newNode;      // Update tail to the new node
            tail.next = head;    // Point new tail to head
        }
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data); // Print the data
            temp = temp.next;            // Move to the next node
            if (temp != head) {
                System.out.print(" -> "); // Print the arrow if not back to head
            }
        } while (temp != head);
        System.out.println(); // Indicate the end of the list
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point tail to head to make it circular
        } else {
            newNode.next = head; // Connect new node to head
            tail.next = newNode;  // Old tail points to new node
            head = newNode;       // Update head to the new node
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(100);
        cll.insert(200);
        cll.insert(300);
        System.out.println("Original Circular List:");
        cll.display();

        System.out.println("Insert at Beginning:");
        cll.insertAtBeginning(500);
        cll.display(); // This will print 500 -> 100 -> 200 -> 300
    }
}

