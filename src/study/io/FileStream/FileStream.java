package study.io.FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
    private String fileName;

    FileStream(String fileName) {
        this.fileName = fileName;
    }

    void writeToFile(byte[] buffer) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(this.fileName);
        fileOutputStream.write(buffer);
        fileOutputStream.close();
        System.out.println("Write to file " + this.fileName);
    }

    void readFromFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.fileName);
        System.out.println("Read from file" + this.fileName);
        byte[] buffer = new byte[512];
        int count = 0;
        count = fileInputStream.read(buffer);
        while (count != -1) {
            count = fileInputStream.read(buffer);
            System.out.println("count = " + count);
            for (int i = 0; i < count; i++) {
                System.out.println(buffer[i] + " ");
            }
            System.out.println();
        }
        fileInputStream.close();
    }

    void copyFile(String fileName2, boolean append) {

    }
}
