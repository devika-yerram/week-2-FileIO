import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Scanner;

public class BackupApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source directory path: ");
        String sourceDirPath = scanner.nextLine();
        System.out.print("Enter the target directory path: ");
        String targetDirPath = scanner.nextLine();

        Path sourcePath = Paths.get(sourceDirPath);
        Path targetPath = Paths.get(targetDirPath);

        DirectoryCopy directoryCopy = new DirectoryCopy();

        try {
            directoryCopy.copyDirectory(sourcePath, targetPath);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}