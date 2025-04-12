import java.util.*;

public class SlidingWindowMax {
    public static int[] findMaxInSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); // To store indices of array elements

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices of all elements smaller than the current element
            // as they won't be the maximum in the current window
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add the current element's index to the deque
            deque.offerLast(i);

            // Record the maximum element for the current window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example array
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        // Find maximums for each sliding window
        int[] result = findMaxInSlidingWindow(nums, k);

        // Output the result
        System.out.println("Maximum elements in each sliding window:");
        for (int max : result) {
            System.out.print(max + " ");
        }
    }
}
