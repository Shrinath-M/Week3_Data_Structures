public class BinarySearch2 {
    public static int peakElement(int[] arr){
        int left = 0, right = arr.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return arr[mid];
            }else if (arr[mid] < arr[mid - 1]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 7, 8, 5, 2};
        int peak = peakElement(numbers);
        System.out.println("The peak element: "+peak);
    }

}
