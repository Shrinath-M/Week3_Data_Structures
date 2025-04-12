import java.util.*;

public class Searchcomp {
    public static void main(String[] args) {
        int searchElement = 42; // Element to search

        // Array (Linear Search)
        int[] array = {10, 20, 30, 40, 42, 50, 60};
        boolean foundInArray = false;
        for (int num : array) {
            if (num == searchElement) {
                foundInArray = true;
                break;
            }
        }
        System.out.println("Array Search (O(N)): " + foundInArray);

        // HashSet (O(1) Search)
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(10, 20, 30, 40, 42, 50, 60));
        System.out.println("HashSet Search (O(1)): " + hashSet.contains(searchElement));

        // TreeSet (O(log N) Search)
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet Search (O(log N)): " + treeSet.contains(searchElement));
    }
}
