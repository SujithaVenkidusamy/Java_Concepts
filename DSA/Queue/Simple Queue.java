class Queue {
    int[] a = new int[5];
    int front = -1;
    int rear = -1;

    // Enqueue method(rear)
    public void enqueue(int data) {
        if (rear == a.length - 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0; // First element being added
            }
            rear++;
            a[rear] = data;
        }
    }

    // Dequeue method(front)
    public void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            int dequeuedValue = a[front];
            front++;
        }
    }

    // Peek method
    public void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print(a[front]);; // Return the front value
        }
    }

    // Display method
    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // For a new line after displaying the queue
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        
        System.out.println("Original Queue:");
        q.display();
        
        q.dequeue();
        System.out.println("After dequeuing:");
        q.display();
        System.out.print("Top element is: ");
        q.peek();
        
    }
}
