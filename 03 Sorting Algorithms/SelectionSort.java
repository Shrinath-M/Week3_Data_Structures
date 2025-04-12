public class SelectionSort {
    public static void main(String[] args) {
        int[] examScores = {78, 85, 62, 90, 73, 88};

        System.out.println("Exam scores before sorting:");
        printArray(examScores);

        selectionSort(examScores);

        System.out.println("\nExam scores after sorting:");
        printArray(examScores);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int score : array) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}

