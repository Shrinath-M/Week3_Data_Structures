import java.io.*;
import java.util.StringTokenizer;
public class PerformanceComparison {
    private static void compareStringConcatenation() {
        String baseString = "hello";
        int iterations = 1000000;
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(baseString);
        }
        long endTime = System.nanoTime();
        System.out.println("String Builder time: " + (endTime - startTime) / 1000000 + " ms");
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(baseString);
        }
        endTime = System.nanoTime();
        System.out.println("String buffer time: "+ (endTime - startTime) / 1000000 +" ms");
    }
    private static void countWords(String filePath){
        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            long startTime = System.nanoTime();
            int wordCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                wordCount += tokenizer.countTokens();
            }
            long endTime = System.nanoTime();

            br.close();
            System.out.println("Total word count: " + wordCount);
            System.out.println("File reading time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        compareStringConcatenation();
        countWords("C:\\Users\\shrin\\OneDrive\\Documents\\File.txt");
    }


}
