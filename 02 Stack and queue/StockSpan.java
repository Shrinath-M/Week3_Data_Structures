import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n]; // Array to store span values
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while the current price is greater than
            // or equal to the price at the stack's top index
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // If the stack is empty, all previous prices are less than or equal to the current price
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push the current index onto the stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        // Example stock prices
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        // Calculate span
        int[] span = calculateSpan(prices);

        // Print the spans for each day
        System.out.println("Stock prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println("\nSpan values: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
