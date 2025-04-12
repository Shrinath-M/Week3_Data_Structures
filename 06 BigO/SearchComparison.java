import java.util.Arrays;
public class SearchComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 6, 3, 8, 4, 7};
        int target = 6;

        int linearResult = linearSearch(data, target);
        Arrays.sort(data);
        int binaryResult = binarySearch(data, target);

        System.out.println("Linear Search found at index: " + linearResult);
        System.out.println("Binary Search found at index: " + binaryResult);
    }
}
