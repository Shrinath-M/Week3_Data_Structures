public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIDs = {104, 102, 109, 101, 107, 105};
        System.out.println("Employee IDs before sorting:");
        printArray(employeeIDs);

        insertionSort(employeeIDs);

        System.out.println("\nEmployee IDs after sorting:");
        printArray(employeeIDs);
    }
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    public static void printArray(int[] array) {
        for (int id : array) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}

