import java.util.*;
public class StringReverser {
    public static String reverseString(String text){
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text to be reversed: ");
        String Original = sc.next();
        String Reversed = reverseString(Original);
        System.out.println("Original String: "+Original);
        System.out.println("Reversed String: "+Reversed);
    }
}