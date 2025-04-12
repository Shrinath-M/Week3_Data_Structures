import java.util.Stack;

public class SortStackUsingRecursion {

    // Recursive function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        // Base case: If stack is empty, return
        if (stack.isEmpty()) {
            return;
        }

        // Pop the top element
        int top = stack.pop();

        // Recursively sort the remaining stack
        sortStack(stack);

        // Insert the popped element back in the sorted stack
        insertInSortedOrder(stack, top);
    }

    // Helper function to insert an element in the sorted stack
    public static void insertInSortedOrder(Stack<Integer> stack, int element) {
        // Base case: If stack is empty or top element is smaller than the current element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Pop the top element
        int top = stack.pop();

        // Recursively insert the element
        insertInSortedOrder(stack, element);

        // Push the popped element back
        stack.push(top);
    }

    public static void main(String[] args) {
        // Example stack
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Stack before sorting: " + stack);

        // Sort the stack
        sortStack(stack);

        System.out.println("Stack after sorting: " + stack);
    }
}
