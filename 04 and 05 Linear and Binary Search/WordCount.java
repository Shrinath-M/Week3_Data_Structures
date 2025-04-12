import java.io.*;
public class WordCount{
    public static void main(String[] args) {
        String filePath = "C:\\Users\\shrin\\OneDrive\\Documents\\File.txt";
        String target = "am";
        int wordCnt = 0;
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.toLowerCase().split("\\W++");
                for (String word : words){
                    if (word.equals(target.toLowerCase())){
                        wordCnt++;
                    }
                }
            }
            System.out.println("Word count: "+wordCnt);
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
