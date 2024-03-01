package FileOperations;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

    public String readFile(String filePath) {
//        return "";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            return String.join(System.lineSeparator(), lines);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeFile(String filePath, String content) {
//        return "";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

