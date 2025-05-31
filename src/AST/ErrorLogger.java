package AST;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ErrorLogger {
    private static final String LOG_FILE = "HandleErrors.txt";

    public static void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            writer.write("[" + LocalDateTime.now() + "] ");
            writer.newLine();
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("فشل تسجيل الخطأ: " + e.getMessage());
        }
    }
}
