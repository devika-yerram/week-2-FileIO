import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileReader {

    public void readLargeFile(String inputFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace(); 
        }
    }
}