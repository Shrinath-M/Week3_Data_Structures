public class Concatenation {
    public static String StrCon(String[] String){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < String.length; i++){
            sb.append(String[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String[] words = {"Shrinath", "is", "a", "good", "boy!"};
        String Concat = StrCon(words);
        System.out.println(Concat);
    }
}
