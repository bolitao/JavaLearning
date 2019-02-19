package exp.cap11.exp61;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("线程正在运行");
        }
    }
}
