import java.io.IOException;
import java.io.RandomAccessFile;

public class FileAccessExample {

    private static final String FILE_PATH = "shared_file.txt";

    public static void main(String[] args) {
        // Create a shared file
        createFile();

        // Two threads reading from the file without access control
        Thread reader1 = new Thread(() -> readFromFile("Reader 1"));
        Thread reader2 = new Thread(() -> readFromFile("Reader 2"));

        reader1.start();
        reader2.start();

        // Thread attempting to write to the file simultaneously
        Thread writer = new Thread(() -> writeToFile("Writer"));
        writer.start();
    }

    private static void createFile() {
        try (RandomAccessFile file = new RandomAccessFile(FILE_PATH, "rw")) {
            // Initial content in the file
            file.writeChars("Initial content");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile(String threadName) {
        try (RandomAccessFile file = new RandomAccessFile(FILE_PATH, "r")) {
            String content = file.readLine();
            System.out.println(threadName + " read: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(String threadName) {
        try (RandomAccessFile file = new RandomAccessFile(FILE_PATH, "rw")) {
            // Simulating a write operation
            file.writeChars("\nData written by " + threadName);
            System.out.println(threadName + " wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

