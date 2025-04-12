import java.io.*;

public class ReadUserInput {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\shrin\\OneDrive\\Documents\\File.txt";

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter text (type 'exit' to stop):");

            String userInput;
            while (!(userInput = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(userInput);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();

            System.out.println("User input has been saved to " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred while processing input: " + e.getMessage());
        }
    }
}

