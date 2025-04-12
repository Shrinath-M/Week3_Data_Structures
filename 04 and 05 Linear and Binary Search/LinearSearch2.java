public class LinearSearch2 {
    public static String linearSearch(String[] sentences, String word){
        for (String words : sentences){
            if (words.contains(word)){
                return words;
            }
        }
        return "Not found";
    }
    public static void main(String[] args) {
        String[] sentence = {"The quick brown fox jumps over the lazy dog.",
                "A journey of a thousand miles begins with a single step.",
                "To be or not to be, that is the question."};
        String word = "single";
        String ls = linearSearch(sentence, word);
        System.out.println(ls);
    }
}
