public class Duplicate {
    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "programming";
        String result = removeDuplicates(original);
        System.out.println("Original: " + original);
        System.out.println("Without duplicates: " + result);
    }
}

