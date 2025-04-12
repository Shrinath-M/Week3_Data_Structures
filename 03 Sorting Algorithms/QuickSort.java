public class QuickSort {
    public static void main(String[] args) {
        double[] productPrices = {299.99, 150.50, 499.75, 199.95, 99.99, 349.25};

        System.out.println("Product prices before sorting:");
        printArray(productPrices);

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("\nProduct prices after sorting:");
        printArray(productPrices);
    }

    public static void quickSort(double[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(double[] array, int low, int high) {
        double pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        double temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void printArray(double[] array) {
        for (double price : array) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
