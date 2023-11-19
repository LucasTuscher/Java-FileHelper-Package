package FileHelper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class createFileHelper {
    public static void createFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
