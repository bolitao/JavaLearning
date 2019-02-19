package exp.cap11.exp61;

public class TryDaemon {
    public static void main(String[] args) {
        DaemonThread dae=new DaemonThread();
        Thread thread = new Thread(dae);
        thread.setDaemon(true);
        thread.start();
        System.out.println("method main() finished");
    }
}
