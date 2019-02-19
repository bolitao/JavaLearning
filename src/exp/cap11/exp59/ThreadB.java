package exp.cap11.exp59;

public class ThreadB implements Runnable {
    int count = 1;
    int num;

    ThreadB(int newNum) {
        num = newNum;
        System.out.println("创建线程" + num);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("线程" + num + ": 计数" + count);
            count++;
            if (count == 3) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Thread a1 = new Thread(new ThreadB(1));
        // Thread a2 = new Thread(new ThreadB(2));
        // Thread a3 = new Thread(new ThreadB(3));
        ThreadB a1 = new ThreadB(1);
        // ThreadB a2 = new ThreadB(2);
        // ThreadB a3 = new ThreadB(3);
        Thread a1Thread = new Thread(a1, "a1");
        a1Thread.start();

        // a1.start();
        // a2.start();
        // a3.start();
    }
}
