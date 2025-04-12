public class BubbleSort {
    public static void main(String[] args) {
        int[] studentMarks = {85, 72, 90, 65, 78, 88};

        System.out.println("Marks before sorting:");
        printArray(studentMarks);
        bubbleSort(studentMarks);
        System.out.println("\nMarks after sorting:");
        printArray(studentMarks);
    }
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int mark : array) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
