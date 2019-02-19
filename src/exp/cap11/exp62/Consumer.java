package exp.cap11.exp62;

public class Consumer extends Thread {
    private Common common;

    public Consumer(Common common) {
        this.common = common;
    }

    @Override
    public void run() {
//        synchronized (common) {
        char c;
        for (int i = 0; i < 5; i++) {
            c = common.get();
            System.out.println("消费者取得的数据是：" + c);
        }
//        }
    }
}
