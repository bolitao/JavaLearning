package exp.cap11.exp62;

public class Producer extends Thread {
    private Common common;

    public Producer(Common common) {
        this.common = common;
    }

    @Override
    public void run() {
//        synchronized (common) {
        char c;
        for (c = 'a'; c <= 'e'; c++) {
            System.out.println("生产的数据是：" + c);
            common.put(c);
//            }
        }
    }
}
