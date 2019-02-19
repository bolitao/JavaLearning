package exp.cap11.exp62;

public class Common {
    private char ch;
    private boolean available = false;

    // synchronized char get() {
    synchronized char get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notify();
        return ch;
    }

    // synchronized void put(char newChar) {
    synchronized void put(char newChar) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ch = newChar;
        available = true;
        notify();
    }
}
