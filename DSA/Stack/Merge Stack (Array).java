class CustomStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push method
    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack is Full");
            return;
        }
        arr[++top] = data;
    }

    // Pop method
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1; // or throw an exception
        }
        return arr[top--];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the number of elements in the stack
    public int size() {
        return top + 1;
    }

    // Get the elements in the stack
    public int[] getElements() {
        int[] elements = new int[size()];
        for (int i = 0; i < size(); i++) {
            elements[i] = arr[i];
        }
        return elements;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two stacks
        CustomStack stack1 = new CustomStack(5);
        CustomStack stack2 = new CustomStack(5);

        // Push elements to the first stack
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        // Push elements to the second stack
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        // Merging the stacks
        int[] mergedArray = mergeStacks(stack1, stack2);

        // Display the merged array
        System.out.print("Merged Stack: ");
        for (int value : mergedArray) {
            System.out.print(value + " ");
        }
    }

    // Method to merge two custom stacks into a single array
    public static int[] mergeStacks(CustomStack stack1, CustomStack stack2) {
        int totalSize = stack1.size() + stack2.size();
        int[] mergedArray = new int[totalSize];
        int index = 0;

        // Pop elements from stack1 and add to the merged array
        while (!stack1.isEmpty()) {
            mergedArray[index++] = stack1.pop();
        }

        // Pop elements from stack2 and add to the merged array
        while (!stack2.isEmpty()) {
            mergedArray[index++] = stack2.pop();
        }

        return mergedArray;
    }
}
