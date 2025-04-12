public class BinarySearch1 {
    public static void findRotPoint(int[] arr){
        int left = 0, right = arr.length - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        System.out.println("Rotation point index: "+left);
    }

    public static void main(String[] args) {
        int[] numbers = {9, 8, 7, 1, 2, 3, 4, 5, 6};
        findRotPoint(numbers);
    }
}
