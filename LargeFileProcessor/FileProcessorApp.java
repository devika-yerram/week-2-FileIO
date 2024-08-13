import java.util.ArrayList;
import java.util.List;

public class FileProcessorApp {

    public static void main(String[] args) {
        String inputFileName = "sales_data.txt";
        String outputFileName = "processed_sales_data.txt";
        LargeFileReader fileReader = new LargeFileReader();
        LargeFileWriter fileWriter = new LargeFileWriter();
        System.out.println("Reading the large sales data file:");
        fileReader.readLargeFile(inputFileName);
        List<String> processedData = new ArrayList<>();
        processedData.add("Processed Data Example 1");
        processedData.add("Processed Data Example 2");
        System.out.println("Writing processed data to the file:");
        fileWriter.writeProcessedData(outputFileName, processedData);
        System.out.println("\nAttempting to read from a non-existent file:");
        fileReader.readLargeFile("non_existent_file.txt");

        System.out.println("\nAttempting to write to a restricted directory:");
        fileWriter.writeProcessedData("/restricted_directory/processed_sales_data.txt", processedData);
    }
}