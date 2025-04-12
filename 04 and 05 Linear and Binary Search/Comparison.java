public class Comparison {
    public static void Comp(String[] string){
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < string.length; i++){
            stringBuffer.append(string[i]).append(" ");
        }
        System.out.println("String Buffer: "+stringBuffer.toString());
        System.out.println("Time taken: "+System.nanoTime());
        for (int i = 0; i < string.length; i++){
            stringBuilder.append(string[i]).append(" ");
        }
        System.out.println("String Buffer: "+stringBuilder.toString());
        System.out.println("Time taken: "+System.nanoTime());
    }

    public static void main(String[] args) {
        String[] words = {"Shrinath", "is", "a", "good", "boy!"};
        Comp(words);
    }
}
