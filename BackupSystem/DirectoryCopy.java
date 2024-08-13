import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class DirectoryCopy {

    public void copyDirectory(Path sourceDir, Path targetDir) {
        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.forEach(sourcePath -> {
                Path targetPath = targetDir.resolve(sourceDir.relativize(sourcePath));
                try {
                    if (Files.isDirectory(sourcePath)) {
                        Files.createDirectories(targetPath);
                    } else {
                        Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred while copying: " + sourcePath + " to " + targetPath);
                }
            });
            System.out.println("Directory copied successfully from " + sourceDir + " to " + targetDir);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the directory: " + e.getMessage());        }
    }
}