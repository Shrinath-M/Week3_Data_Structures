import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor
    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation: Adds an element to the queue
    public void enqueue(int value) {
        stack1.push(value); // Push the element onto stack1
    }

    // Dequeue operation: Removes an element from the queue
    public int dequeue() {
        // If stack2 is empty, transfer elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // If stack2 is still empty, the queue is empty
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.pop(); // Pop the top element from stack2
    }

    // Peek operation: Gets the front element of the queue without removing it
    public int peek() {
        // If stack2 is empty, transfer elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // If stack2 is still empty, the queue is empty
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.peek(); // Peek the top element of stack2
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeue: " + queue.dequeue()); // Output: 10
        System.out.println("Peek: " + queue.peek());       // Output: 20
        System.out.println("Dequeue: " + queue.dequeue()); // Output: 20
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
    }
}
