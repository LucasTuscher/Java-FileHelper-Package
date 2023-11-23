import FileHelper.fileExistsHelper;
import FileHelper.readFileLinesHelper;
import FileHelper.createFileHelper;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Neue Klassen Objekte erstellen (FileHelper)
        createFileHelper test1 = new createFileHelper();
        readFileLinesHelper test2 = new readFileLinesHelper();
        fileExistsHelper test3 = new fileExistsHelper();

        // Neuen FileHelper testen
        String filePath = "example.txt";
        String content = "Hello, this is a test file content.";

        try {
            // Datei erstellen
            test1.createFile(filePath, content);
            System.out.println("Datei erfolgreich erstellt.");

            // Dateiinhalt lesen
            List<String> lines = test2.readFileLines(filePath);
            System.out.println("Inhalt der Datei: ");
            for (String line : lines) {
                System.out.println(line);
            }

            // Überprüfen, ob die Datei existiert
            if (test3.fileExists(filePath)) {
                System.out.println("Die Datei existiert.");
            } else {
                System.out.println("Die Datei existiert nicht.");
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Bearbeiten der Datei: " + e.getMessage());
        }

        // Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Hier kannst du etwas eingeben:");
        String eingabe = scan.nextLine();

    }

}
