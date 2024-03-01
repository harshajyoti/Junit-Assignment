package TestingFileOperationTest;

import FileOperations.FileUtils;
import jdk.nashorn.internal.objects.Global;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileUtils {

    FileUtils fileUtils;
    String filePath;
    String content;

    @BeforeEach
    public void setup() {
        fileUtils = new FileUtils();
        filePath = "testfile.txt";
        content = "Java is a programming language" + System.lineSeparator() +
                "Java supports Object Oriented Programming";
    }

    @AfterEach
    public void deleteFile() {
        try {
            Files.deleteIfExists(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testReadFile() throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
        String readContent = fileUtils.readFile(filePath);

        assertEquals(content, readContent);
    }

    @Test
    public void testWriteFile() throws IOException {
        fileUtils.writeFile(filePath, content);
        String readContent = fileUtils.readFile(filePath);

        assertEquals(content, readContent);
    }
}

