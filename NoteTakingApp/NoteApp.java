import java.util.Scanner;

public class NoteApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        FileReaderDemo fileReaderDemo = new FileReaderDemo();

        System.out.print("Enter the file name to save the note: ");
        String fileName = scanner.nextLine();

        System.out.print("Enter your note: ");
        String note = scanner.nextLine();

        fileWriterDemo.saveNoteToFile(fileName, note);

        System.out.println("Note saved successfully. Reading the note from the file...");

        fileReaderDemo.readNoteFromFile(fileName);
    }
}