// Step-1: Create class for Node
class Node {
    int data;
    Node next;

    // Step-2: Create a constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Step-3: Create LinkedList class
class LinkedList {
    Node head;

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set head to the new node
        } else {
            newNode.next = head; // Point new node's next to current head
            head = newNode; // Update head to new node
        }
    }

    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set head to new node
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // Traverse to the last node
            }
            temp.next = newNode; // Set the next of the last node to new node
        }
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Save next node
            current.next = prev; // Reverse current node's pointer
            prev = current; // Move prev and current one step ahead
            current = next;
        }

        head = prev; // Set head to the last node (the new head)
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.print("List is Empty"); // Handle empty list case
            return;
        }
        while (temp != null) {
            System.out.print(temp.data); // Print current node's data
            if (temp.next != null) {
                System.out.print(" -> "); // If there's a next node, print an arrow
            }
            temp = temp.next; // Move to the next node
        }
        System.out.println();
    }
}

// Step-4: Main class
public class Main {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.insertAtBeginning(300); // Insert data at the beginning (Node 3)
        link.insertAtBeginning(200); // Node 2
        link.insertAtBeginning(100); // Node 1

        System.out.println("The List:");
        link.display(); // Display the linked list

        link.reverse(); // Reverse the linked list

        System.out.println("Reversed List:");
        link.display(); // Display the reversed linked list
    }
}
