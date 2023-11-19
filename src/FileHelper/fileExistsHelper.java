package FileHelper;

import java.io.File;

public class fileExistsHelper {
    public static boolean fileExists(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }
}
