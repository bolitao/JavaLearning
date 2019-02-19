package exp.cap9.exp49;

import java.io.IOException;

public class CatchException {
    public static void main(String[] args) {
        System.out.println("Start.");
        try {
            System.in.read();
            //等待用户键入字符
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Finished.");
    }
}
