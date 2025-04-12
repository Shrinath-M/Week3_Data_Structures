public class LinearSearch1 {
    public static int firstNeg(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 2, 9, -3, -9, -8};
        int index = firstNeg(numbers);
        if (index == -1){
            System.out.println("No negative number.");
        }
        else {
            System.out.println("The first negative number is in the index "+ index +" .");
        }
    }
}
