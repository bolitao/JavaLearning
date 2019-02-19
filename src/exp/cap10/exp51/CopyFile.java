package exp.cap10.exp51;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        fileInputStream = new FileInputStream("myfile.txt");
        fileOutputStream = new FileOutputStream("yourfile.txt");
        do {
            i = fileInputStream.read();
            if (i != -1) {
                fileOutputStream.write(i);
            }
        } while (i != -1);
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("File myfile.txt has been copied as yourfile.txt");
    }
}
