package exp.cap10.exp50;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("myfile.txt");
            do {
                i = fileInputStream.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
